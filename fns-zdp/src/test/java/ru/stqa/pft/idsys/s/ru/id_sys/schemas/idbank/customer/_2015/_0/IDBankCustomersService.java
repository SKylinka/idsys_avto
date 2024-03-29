
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "IDBankCustomersService", targetNamespace = "http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", wsdlLocation = "http://192.168.1.211:8080/bank_client/service/idbank_customers?wsdl")
public class IDBankCustomersService
    extends Service
{

    private final static URL IDBANKCUSTOMERSSERVICE_WSDL_LOCATION;
    private final static WebServiceException IDBANKCUSTOMERSSERVICE_EXCEPTION;
    private final static QName IDBANKCUSTOMERSSERVICE_QNAME = new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "IDBankCustomersService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.1.211:8080/bank_client/service/idbank_customers?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        IDBANKCUSTOMERSSERVICE_WSDL_LOCATION = url;
        IDBANKCUSTOMERSSERVICE_EXCEPTION = e;
    }

    public IDBankCustomersService() {
        super(__getWsdlLocation(), IDBANKCUSTOMERSSERVICE_QNAME);
    }

    public IDBankCustomersService(WebServiceFeature... features) {
        super(__getWsdlLocation(), IDBANKCUSTOMERSSERVICE_QNAME, features);
    }

    public IDBankCustomersService(URL wsdlLocation) {
        super(wsdlLocation, IDBANKCUSTOMERSSERVICE_QNAME);
    }

    public IDBankCustomersService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, IDBANKCUSTOMERSSERVICE_QNAME, features);
    }

    public IDBankCustomersService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IDBankCustomersService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IDBankCustomersPortType
     */
    @WebEndpoint(name = "IDBankCustomersPort")
    public IDBankCustomersPortType getIDBankCustomersPort() {
        return super.getPort(new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "IDBankCustomersPort"), IDBankCustomersPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IDBankCustomersPortType
     */
    @WebEndpoint(name = "IDBankCustomersPort")
    public IDBankCustomersPortType getIDBankCustomersPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "IDBankCustomersPort"), IDBankCustomersPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (IDBANKCUSTOMERSSERVICE_EXCEPTION!= null) {
            throw IDBANKCUSTOMERSSERVICE_EXCEPTION;
        }
        return IDBANKCUSTOMERSSERVICE_WSDL_LOCATION;
    }

}
