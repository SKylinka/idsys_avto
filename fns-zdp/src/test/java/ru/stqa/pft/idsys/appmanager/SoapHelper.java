/**
 * Что бы получить схемы для сервиса необходимо выполнить команду из каталога явы
 * wsimport -s {путь до каталога исходных файлов без скобочек} -d {путь до каталога откомпилированых файлов без скобочек} {путь до wsdl без скобочек}
 * После выгрузки схемы будут иметь некорректные импорты классов, их нужно поправить. + ошибки я их закомитил
 * Так же я поменял тип передаваемых данных в LookupCustomersRq.java(сформировались хуево в 3ех местах) LookupCustomersRq.Customers LookupCustomersRq.DataFilter
 */

package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.LookupCustomersRqData;
import ru.stqa.pft.idsys.model.LookupCustomersRsData;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.*;
import javax.xml.namespace.QName;
import javax.xml.soap.*;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.PortInfo;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import static ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.CustomerDataType.FNS_RESTRICTION;

public class SoapHelper implements SOAPHandler<SOAPMessageContext> {

  private static IDBankCustomersPortType servicePort;
  private final Properties properties;

  public SoapHelper() throws IOException {
    properties = new Properties();
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }

// Метод создания самого запроса
  public void createLookupCustomersRq(LookupCustomersRqData lookupCustomersRqData) throws LookupCustomersErr {
    LookupCustomersRq getLookupCustomersRq = new LookupCustomersRq();
    LookupCustomersRq.DataFilter dataFilter = new LookupCustomersRq.DataFilter();
    LookupCustomersRq.Customers customers = new LookupCustomersRq.Customers();
    dataFilter.getFilterItem().add(0,FNS_RESTRICTION);
    customers.getCustomer().add(0, new Customer() {{
                      setINN(lookupCustomersRqData.getInn());
            }});
    getLookupCustomersRq.setDataFilter(dataFilter);
    getLookupCustomersRq.setCustomers(customers);

    LookupCustomersRs getlookupCustomersRs = getCustomersPort().lookupCustomers(getLookupCustomersRq);

    //getlookupCustomersRs.getErrors();
    System.out.println(getlookupCustomersRs);

   }


   //Метод проверки ответа soap
   /*
   public void checkLookupCustomersRs(LookupCustomersRsData lookupCustomersRsData) throws UnsupportedEncodingException {
     ArrayList<LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult> checkResult = new ArrayList<>();
     File file = new File("src/test/resources/temp/tempRs.xml");
     LookupCustomersRs lookupCustomersRsinfo = new LookupCustomersRs();
     while (checkResult) {
       ByteArrayOutputStream os = new ByteArrayOutputStream();
       getlookupCustomersRs.writeTo(os);
       os.write(LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.get);
       String responseXml = new String(os.toByteArray(), "UTF-8");
       try (Writer writer = new FileWriter(file)) {
         writer.write(responseXml);
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
   }
*/

     //Метод для формирования Header в soap запросе
  public boolean handleMessage(SOAPMessageContext context)
  {
    // Apply this handler to only outbound traffic
    if((Boolean)context.get(SOAPMessageContext.MESSAGE_OUTBOUND_PROPERTY))
    {
      // get the message
      SOAPMessage message = context.getMessage();
      try
      {
        // get the message header
        SOAPEnvelope envelope = message.getSOAPPart().getEnvelope();
        SOAPHeader header = envelope.getHeader();
        if (header == null)
        {
          header = envelope.addHeader();
        }
        // add the UsernameToken header
        // create the Security Header
        SOAPElement security =
                header.addChildElement("Security", "wsse", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd");
        // create a UsernameToken element
        SOAPElement usernameToken =
                security.addChildElement("UsernameToken", "wsse");
        usernameToken.addAttribute(new QName("xmlns:wsu"), "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd");
        // add the username element
        SOAPElement username =
                usernameToken.addChildElement("Username", "wsse");
        username.addTextNode(properties.getProperty("soap.Login"));
        // add the password element
        SOAPElement password =
                usernameToken.addChildElement("Password", "wsse");
        password.setAttribute("Type", "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText");
        password.addTextNode(properties.getProperty("soap.Password"));
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    // allow any other handler to execute
    return true;
  }

  //метод для формирования тела soap запроса и отправки его
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
  public boolean handleFault(SOAPMessageContext context) {
    return false;
  }

  @Override
  public void close(MessageContext context) {

  }




}
