package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.*;

import javax.xml.XMLConstants;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

public class SoapHelper implements SOAPHandler {

  private static IDBankCustomersPortType servicePort;
  private final Properties properties;

  public SoapHelper() throws IOException {
    properties = new Properties();
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }


  public void createLookupCustomersRq(LookupCustomersRq lookupCustomersRq) throws LookupCustomersErr {
    LookupCustomersRq lookupCustomersRq = new LookupCustomersRq();

    lookupCustomersRq.setDataFilter(
            new CustomerDataFilterItem() {{
              setTimeFilter("FNS_RESTRICTION");
            }
            }
     );

    lookupCustomersRq.setCustomers(
            new Customer() {{
              setINN("123456789000");
            }
              setINN("123456789000");
            }
    );

    LookupCustomersRs lookupCustomersRs = getCustomersPort().lookupCustomers(lookupCustomersRq);
    lookupCustomersRs.getErrors();
    //chekChargesRs(lookupCustomersRs);
  }

   /*
  private void chekChargesRs(LookupCustomersRs lookupCustomersRs) throws IOException {
    if (lookupCustomersRs.getExportChargesResponse()!= null) {

      Iterator<ExportChargesResponseEx.Charges.ChargeInfo> chargeInfo = LookupCustomersRs.getExportChargesResponse().getCharges().getChargeInfo().iterator();
      File file = new File("src/test/resources/wsdl/tmp/tempDecodeChargeData.xml");
      lookupRs chargeRsInfo = new ChargesRs();
      while (chargeInfo.hasNext()) {
        ExportChargesResponseEx.Charges.ChargeInfo nxtChargeInfo = chargeInfo.next();
        chargeRsInfo.add(new ChargesRsData()
                .withAmountToPay(String.valueOf(nxtChargeInfo.getAmountToPay()))
                .withIsRevoked(String.valueOf(nxtChargeInfo.getIsRevoked().isValue()))
                .withQuittancePaymentStatus(nxtChargeInfo.getQuittanceWithPaymentStatus())
        );

        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        bout.write(nxtChargeInfo.getChargeData());
        String chargeData = new String(bout.toByteArray(), "UTF-8");

        try (Writer writer = new FileWriter(file)) {
          writer.write(chargeData);
        } catch (IOException e) {
          e.printStackTrace();
        }
        validateXMLFileAgainstXSD(file, "src/test/resources/wsdl/xsdGMP/entity/document/Charge.xsd");
      }
    } else if(lookupCustomersRs.getErrors() != null){

    }
  }
*/


  public void validateXMLFileAgainstXSD(File file, String xsdPath){
    try {
      SchemaFactory factory =
              SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
      Schema schema = factory.newSchema(new File(xsdPath));
      Validator validator = schema.newValidator();
      validator.validate(new StreamSource(file));
    } catch (org.xml.sax.SAXException e) {
      System.out.println("Exception: " + e.getMessage());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  private synchronized IDBankCustomersPortType getCustomersPort() {
    if (servicePort == null) {
      IDBankCustomersService service = new IDBankCustomersService();
      service.setHandlerResolver(new HandlerResolver() {
        public List getHandlerChain(PortInfo portInfo) {
          List handlerChain = new ArrayList();
          SoapHelper hh = null;
          try {
            hh = new SoapHelper();
          } catch (IOException e) {
            e.printStackTrace();
          }
          handlerChain.add(hh);
          return handlerChain;
        }
      });
      final BindingProvider provider = (BindingProvider) service.getIDBankCustomersPort();
      provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, properties.getProperty("soap.URL"));
      servicePort = (IDBankCustomersPortType) provider;
    }
    return servicePort;
  }

  @Override
  public Set<QName> getHeaders() {
    return null;
  }

  @Override
  public boolean handleMessage(MessageContext context) {
    return false;
  }

  @Override
  public boolean handleFault(MessageContext context) {
    return false;
  }

  @Override
  public void close(MessageContext context) {

  }
}
