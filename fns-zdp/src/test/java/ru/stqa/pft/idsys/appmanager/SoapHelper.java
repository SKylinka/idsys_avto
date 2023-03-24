/**
 * Что бы получить схемы для сервиса необходимо выполнить команду из каталога явы
 * wsimport -s {путь до каталога исходных файлов без скобочек} -d {путь до каталога откомпилированых файлов без скобочек} {путь до wsdl без скобочек}
 * После выгрузки схемы будут иметь некорректные импорты классов, их нужно поправить. + ошибки я их закомитил
 * Так же я поменял тип передаваемых данных в LookupCustomersRq.java(сформировались хуево в 3ех местах) LookupCustomersRq.Customers LookupCustomersRq.DataFilter
 */

package ru.stqa.pft.idsys.appmanager;

import ru.stqa.pft.idsys.model.*;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.Error;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
  public void createLookupCustomersRq(LookupCustomersRqData lookupCustomersRqData) throws LookupCustomersErr, UnsupportedEncodingException {
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
    //checkLookupCustomersRs(getlookupCustomersRs);
    System.out.println(getlookupCustomersRs);

   }


   //Метод проверки ответа soap
/*
   public void checkLookupCustomersRs(LookupCustomersRs getlookupCustomersRs) throws UnsupportedEncodingException {
     //ArrayList<LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult> checkResult = new ArrayList<>();
     Iterator<LookupCustomersRs.CustomersData.CustomerData> checkResult =
             getlookupCustomersRs.getCustomersData().getCustomerData().iterator();
     File file = new File("src/test/resources/temp/tempRs.xml");
     LookupCustomersRs lookupCustomersRsInfo = new LookupCustomersRs();
     while (checkResult.hasNext()) {
       LookupCustomersRs.CustomersData.CustomerData lcc = checkResult.next();
       lookupCustomersRsInfo.getCustomersData().getCustomerData()
               .add(0, new LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult().);
              ByteArrayOutputStream os = new ByteArrayOutputStream(); //чтение и запись масива байтов
       os.write(lcc.getRestrictionCheckResult());
       os.write(LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult);
       String responseXml = new String(os.toByteArray(), "UTF-8"); //чтение и запись масива байтов
       try (Writer writer = new FileWriter(file)) {
         writer.write(responseXml);
       } catch (IOException e) {
         e.printStackTrace();
       }
     }
   }
*/

  public ZDPWsRsData getResponseData(LookupCustomersRs response) {
    ZDPWsRsData zdpWsFirstRsData = new ZDPWsRsData();
    ZDPRsData zdpRsData = new ZDPRsData();
    ZDPRsDDs zdpDecisions = new ZDPRsDDs();
    try{
      Iterator<LookupCustomersRs.CustomersData.CustomerData> customerData = response.getCustomersData().getCustomerData().iterator();
      while (customerData.hasNext()){
        LookupCustomersRs.CustomersData.CustomerData nextCD = customerData.next();

        if(nextCD.getRestrictionCheckResult().getErrors() != null){
          Iterator<Error> cdErrorData = nextCD.getRestrictionCheckResult().getErrors().getError().iterator();
          while (cdErrorData.hasNext()){
            Error nextE = cdErrorData.next();
            zdpRsData
                    .withErrorDescription(nextE.getMessage())
                    .withErrorCode(nextE.getCode());
          }
        }

        if(nextCD.getRestrictionCheckResult().getRestriction() != null){
          Iterator<LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction> restrictions = nextCD.getRestrictionCheckResult().getRestriction().iterator();
          while (restrictions.hasNext()){
            LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction nextResrtiction = restrictions.next();
            zdpDecisions.add(new ZDPRsDecisionData()
                    .setDecisionNum(nextResrtiction.getNumber())
                    .setDecisionDate(dateFormat(nextResrtiction.getDate().toString()))
                    .setDecisionTaxOrgCode(nextResrtiction.getCodeNO())
                    .setDecisionBankBic(nextResrtiction.getBIK())
                    .setFederalBDDateTime(dateFormat(nextResrtiction.getDateOfReceiveInFederalDB().toString())));
          }
          zdpRsData.withDecisions(zdpDecisions);
        }

        if(nextCD.getRestrictionCheckResult().getINN() !=null){
          zdpWsFirstRsData.withInn(nextCD.getRestrictionCheckResult().getINN());
        }
        if(nextCD.getRestrictionCheckResult().getID() != null){
          zdpRsData.withId(nextCD.getRestrictionCheckResult().getID());
        }
        if (nextCD.getRestrictionCheckResult().getNameOfOrganization() != null){
          zdpRsData.withTaxpayerOrgName(nextCD.getRestrictionCheckResult().getNameOfOrganization());
        }

        zdpWsFirstRsData
                .withObjectID(nextCD.getRestrictionCheckResult().getObjectID())
                .withObjectStatus(nextCD.getRestrictionCheckResult().getObjectStatus())
                .withStatusName(nextCD.getRestrictionCheckResult().getStatusName())
                .withCdObjectID(nextCD.getObjectID())
                .withCdObjectStatus(nextCD.getObjectStatus())
                .withResponseData(zdpRsData);

        return zdpWsFirstRsData;
      }
    }catch (Exception e){
      e.printStackTrace();
    }
    try{
      Iterator<Error> errorData = response.getErrors().getError().iterator();
      while (errorData.hasNext()){
        Error nextE = errorData.next();
        zdpRsData
                .withErrorDescription(clearMessage(nextE.getMessage()))
                .withErrorCode(nextE.getCode());
        zdpWsFirstRsData.withResponseData(zdpRsData);
        return zdpWsFirstRsData;
      }
    }catch (Exception e){
      e.printStackTrace();
    }
    return null;
  }


  public void checkStatusLookupCustomersRq () throws LookupCustomersErr {
    LookupCustomersRq getLookupCustomersRq = new LookupCustomersRq();
    LookupCustomersRq.DataFilter dataFilter = new LookupCustomersRq.DataFilter();
    dataFilter.getFilterItem().add(0,FNS_RESTRICTION);
    String idd = "31005516888";
    getLookupCustomersRq.setDataFilter(dataFilter);
    getLookupCustomersRq.setTaskID(idd);
    LookupCustomersRs getlookupCustomersRs = getCustomersPort().lookupCustomers(getLookupCustomersRq);
    //getlookupCustomersRs.getErrors();
    System.out.println(getlookupCustomersRs);
  }

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

  protected String dateFormat(String date) throws ParseException {
    if (date != null) {
      if(date.matches("\\d{4}-\\d{2}-\\d{2}Z")) {
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new SimpleDateFormat("yyyy-MM-dd'Z'").parse(date));
      }else if(date.matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}.\\d{3}Z")){
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").parse(date));
      }else if(date.matches("\\d{4}-\\d{2}-\\d{2}")){
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new SimpleDateFormat("yyyy-MM-dd").parse(date));
      }else if(date.matches("\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}")){
        return new SimpleDateFormat("dd.MM.yyyy HH:mm:ss").format(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(date));
      }
    }
    return null;
  }

  public String clearMessage(String msg){
    return msg.replaceAll("[0-9\\\\null\\n\\.]", "");
  }

}
