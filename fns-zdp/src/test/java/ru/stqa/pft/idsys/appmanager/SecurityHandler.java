package ru.stqa.pft.idsys.appmanager;

import java.util.Collections;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

/**
 * This is a SOAP handler that applies a security header and a language header to a SOAP message.
 */
public class SecurityHandler implements SOAPHandler<SOAPMessageContext>
{
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
   * If the value is null, the language header will not be added.
   */
  public SecurityHandler(String username, String password, String acceptLanguage)
  {
    i_username = username;
    i_password = password;
    i_acceptLanguage = acceptLanguage;
  }

  @Override
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
    usernameElement.addTextNode(i_username);
    usernameToken.addChildElement(usernameElement);

    // add the password element
    SOAPElement passwordElement =
            factory.createElement(PASSWORD, WSSE_PREFIX, WS_SECURITY_NAMESPACE3);
    passwordElement.addTextNode(i_password);
    usernameToken.addChildElement(passwordElement);

    // create the Security Header
    SOAPElement securityHeader =
            factory.createElement(SECURITY, WSSE_PREFIX, WS_SECURITY_NAMESPACE);
    securityHeader.addChildElement(usernameToken);

    return securityHeader;
  }

  @Override
  public boolean handleFault(SOAPMessageContext context)
  {
    // allow any other handler to execute
    return true;
  }

  @Override
  public void close(MessageContext context)
  {
    // do nothing
  }

  @Override
  public Set<QName> getHeaders()
  {
    return Collections.emptySet();
  }

}