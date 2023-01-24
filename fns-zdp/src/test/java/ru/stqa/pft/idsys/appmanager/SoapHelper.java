package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.LookupCustomersRqData;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.*;
import javax.xml.namespace.QName;
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

public class SoapHelper implements SOAPHandler<SOAPMessageContext> {

  private static IDBankCustomersPortType servicePort;
  private final Properties properties;

  public SoapHelper() throws IOException {
    properties = new Properties();
    String target = System.getProperty("target", "local");
    properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
  }


  public void createLookupCustomersRq(LookupCustomersRqData lookupCustomersRqData) throws LookupCustomersErr {
    LookupCustomersRq getLookupCustomersRq = new LookupCustomersRq();
    getLookupCustomersRq.setDataFilter(String.valueOf(new CustomerDataFilterItem() {{
        setTimeFilter(lookupCustomersRqData.getCustomerDataType());
            }}));
    getLookupCustomersRq.setCustomers( new Customer() {{
                      setINN(lookupCustomersRqData.getInn());
            }});


    LookupCustomersRs getlookupCustomersRs = getCustomersPort().lookupCustomers(getLookupCustomersRq);

   }



  public void createLookupCustomersRqOld(LookupCustomersRqData lookupCustomersRqData) throws LookupCustomersErr {
    LookupCustomersRq getLookupCustomersRq = new LookupCustomersRq();
    getLookupCustomersRq.setDataFilter( new CustomerDataFilterItem() {{
      setTimeFilter(lookupCustomersRqData.withCustomerDataType());
    }});
    getLookupCustomersRq.setCustomers( new Customer() {{
      setINN(lookupCustomersRqData.withInn());
    }});

    LookupCustomersRs getlookupCustomersRs = getCustomersPort().lookupCustomers(getLookupCustomersRq);

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
  public boolean handleMessage(SOAPMessageContext context) {
    return false;
  }

  @Override
  public boolean handleFault(SOAPMessageContext context) {
    return false;
  }

  @Override
  public void close(MessageContext context) {

  }
}
