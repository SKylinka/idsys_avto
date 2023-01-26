/**
 * Что бы получить схемы для сервиса необходимо выполнить команду из каталога явы
 * wsimport -s {путь до каталога исходных файлов без скобочек} -d {путь до каталога откомпилированых файлов без скобочек} {путь до wsdl без скобочек}
 * После выгрузки схемы будут иметь некорректные импорты классов, их нужно поправить. + ошибки я их закомитил
 * Так же я поменял тип передаваемых данных в LookupCustomersRq.java(сформировались хуево в 3ех местах) LookupCustomersRq.Customers LookupCustomersRq.DataFilter
 */

package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.LookupCustomersRqData;
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
    getlookupCustomersRs.getErrors();
   }


/**
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
 */

// WS-Security header values
public static final String SECURITY = "Security";
  public static final String USERNAME_TOKEN = "UsernameToken";
  public static final String USERNAME = "Username";
  public static final String PASSWORD = "Password";
  public static final String WS_SECURITY_NAMESPACE =
          "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd";
  public static final String WS_SECURITY_NAMESPACE2 =
          "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd";
  public static final String WS_SECURITY_NAMESPACE3 =
          "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText";

  // prefixes
  public static final String WSSE_PREFIX = "wsse"; // ws service security
  public static final String SPSS_PREFIX = "spss"; // spss prefix

  // SPSS custom language header values
  public static final String SPSS_HEADER_NAMESPACE = "http://xml.spss.com/ws/headers";
  public static final String CLIENT_ACCEPT_LANGUAGE_HEADER = "client-accept-language";

  private String i_username;
  private String i_password;
  private String i_acceptLanguage;

  /**
   * Creates a security and language handler
   * @param username A user name to access the web service. Cannot be null.
   * @param password A password to access the web service. Cannot be null.
   * @param acceptLanguage The language that should be used by the web service.
 * This value should be formatted according to the HTTP specification regarding
 * the Accept-Language HTTP header (e.g. en-US;q=1.0, en;q=0.8)
   */
  public void SecurityHandler(String username, String password, String acceptLanguage)
  {
    i_username = properties.getProperty("soap.Login");
    i_password = properties.getProperty("soap.Password");
    i_acceptLanguage = null;
  }




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
        header.addChildElement(createUsernameTokenSecurityHeader());
        // assuming the language was provided, apply the custom language header
        if(i_acceptLanguage != null)
        {
          header.addChildElement(createLanguageHeader());
        }
      }
      catch (Exception e)
      {
        e.printStackTrace();
      }
    }
    // allow any other handler to execute
    return true;
  }

  /**
   * This method creates a custom language header, which allows the scoring service
   * to use the given language if possible.
   * @return A custom language header
   * @throws Exception
   */
  private SOAPElement createLanguageHeader() throws Exception
  {
    SOAPFactory factory = SOAPFactory.newInstance();

    // create a custom language header
    SOAPElement languageHeader =
            factory.createElement(CLIENT_ACCEPT_LANGUAGE_HEADER,SPSS_PREFIX,SPSS_HEADER_NAMESPACE);

    // include the language text
    languageHeader.addTextNode(i_acceptLanguage);

    return languageHeader;
  }

  /**
   * Creates the WS-Security SOAP header for UsernameToken as SOAPElement.
   *
   * @return the WS-Security SOAP header for UsernameToken
   * @throws Exception as appropriate
   */
  private SOAPElement createUsernameTokenSecurityHeader() throws Exception
  {
    SOAPFactory factory = SOAPFactory.newInstance();

    // create a UsernameToken element
    SOAPElement usernameToken =
            factory.createElement(USERNAME_TOKEN, WSSE_PREFIX, WS_SECURITY_NAMESPACE2);

    // add the username element
    SOAPElement usernameElement =
            factory.createElement(USERNAME, WSSE_PREFIX, WS_SECURITY_NAMESPACE);
    usernameElement.addTextNode(properties.getProperty("soap.Login"));
    usernameToken.addChildElement(usernameElement);

    // add the password element
    SOAPElement passwordElement =
            factory.createElement(PASSWORD, WSSE_PREFIX, WS_SECURITY_NAMESPACE3);
    passwordElement.addTextNode(properties.getProperty("soap.Password"));
    usernameToken.addChildElement(passwordElement);

    // create the Security Header
    SOAPElement securityHeader =
            factory.createElement(SECURITY, WSSE_PREFIX, WS_SECURITY_NAMESPACE);
    securityHeader.addChildElement(usernameToken);

    return securityHeader;
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
  public boolean handleFault(SOAPMessageContext context) {
    return false;
  }

  @Override
  public void close(MessageContext context) {

  }


}
