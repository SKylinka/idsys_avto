
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import ru.id_sys.schemas.idbank.common._2012._0.Error;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.id_sys.schemas.idbank.customer._2015._0 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Error_QNAME = new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "Error");
    private final static QName _Customer_QNAME = new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "Customer");
    private final static QName _LookupCustomersRs_QNAME = new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "LookupCustomersRs");
    private final static QName _LookupCustomersRq_QNAME = new QName("http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", "LookupCustomersRq");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.id_sys.schemas.idbank.customer._2015._0
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BankruptcyData }
     * 
     */
    public BankruptcyData createBankruptcyData() {
        return new BankruptcyData();
    }

    /**
     * Create an instance of {@link CustomerDataFilterItem }
     * 
     */
    public CustomerDataFilterItem createCustomerDataFilterItem() {
        return new CustomerDataFilterItem();
    }

    /**
     * Create an instance of {@link LookupCustomersRs }
     * 
     */
    public LookupCustomersRs createLookupCustomersRs() {
        return new LookupCustomersRs();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData }
     * 
     */
    public LookupCustomersRs.CustomersData createLookupCustomersRsCustomersData() {
        return new LookupCustomersRs.CustomersData();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData createLookupCustomersRsCustomersDataCustomerData() {
        return new LookupCustomersRs.CustomersData.CustomerData();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult createLookupCustomersRsCustomersDataCustomerDataEGRZAGSResult() {
        return new LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult createLookupCustomersRsCustomersDataCustomerDataRestrictionCheckResult() {
        return new LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.AccountData }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.AccountData createLookupCustomersRsCustomersDataCustomerDataAccountData() {
        return new LookupCustomersRs.CustomersData.CustomerData.AccountData();
    }

    /**
     * Create an instance of {@link LookupCustomersRq }
     * 
     */
    public LookupCustomersRq createLookupCustomersRq() {
        return new LookupCustomersRq();
    }

    /**
     * Create an instance of {@link Customer }
     * 
     */
    public Customer createCustomer() {
        return new Customer();
    }

    /**
     * Create an instance of {@link CustomerDocument }
     * 
     */
    public CustomerDocument createCustomerDocument() {
        return new CustomerDocument();
    }

    /**
     * Create an instance of {@link BankruptcyData.NameHistory }
     * 
     */
    public BankruptcyData.NameHistory createBankruptcyDataNameHistory() {
        return new BankruptcyData.NameHistory();
    }

    /**
     * Create an instance of {@link CustomerDataFilterItem.TimeFilter }
     * 
     */
    public CustomerDataFilterItem.TimeFilter createCustomerDataFilterItemTimeFilter() {
        return new CustomerDataFilterItem.TimeFilter();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults createLookupCustomersRsCustomersDataCustomerDataBankruptcyLookupResults() {
        return new LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.INNMatchResults }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.INNMatchResults createLookupCustomersRsCustomersDataCustomerDataINNMatchResults() {
        return new LookupCustomersRs.CustomersData.CustomerData.INNMatchResults();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults createLookupCustomersRsCustomersDataCustomerDataOMSMatchResults() {
        return new LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.INNbyFIO }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.INNbyFIO createLookupCustomersRsCustomersDataCustomerDataINNbyFIO() {
        return new LookupCustomersRs.CustomersData.CustomerData.INNbyFIO();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult createLookupCustomersRsCustomersDataCustomerDataRMSPLookupResult() {
        return new LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate createLookupCustomersRsCustomersDataCustomerDataEGRZAGSResultDeathCertificate() {
        return new LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.DeathCertificate();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc createLookupCustomersRsCustomersDataCustomerDataEGRZAGSResultConfirmingDeathDoc() {
        return new LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.ConfirmingDeathDoc();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction createLookupCustomersRsCustomersDataCustomerDataRestrictionCheckResultRestriction() {
        return new LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.Restriction();
    }

    /**
     * Create an instance of {@link LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches }
     * 
     */
    public LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches createLookupCustomersRsCustomersDataCustomerDataAccountDataMatches() {
        return new LookupCustomersRs.CustomersData.CustomerData.AccountData.Matches();
    }

    /**
     * Create an instance of {@link LookupCustomersRq.DataFilter }
     * 
     */
    public LookupCustomersRq.DataFilter createLookupCustomersRqDataFilter() {
        return new LookupCustomersRq.DataFilter();
    }

    /**
     * Create an instance of {@link LookupCustomersRq.Customers }
     * 
     */
    public LookupCustomersRq.Customers createLookupCustomersRqCustomers() {
        return new LookupCustomersRq.Customers();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Error }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", name = "Error")
    public JAXBElement<Error> createError(Error value) {
        return new JAXBElement<Error>(_Error_QNAME, Error.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Customer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", name = "Customer")
    public JAXBElement<Customer> createCustomer(Customer value) {
        return new JAXBElement<Customer>(_Customer_QNAME, Customer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupCustomersRs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", name = "LookupCustomersRs")
    public JAXBElement<LookupCustomersRs> createLookupCustomersRs(LookupCustomersRs value) {
        return new JAXBElement<LookupCustomersRs>(_LookupCustomersRs_QNAME, LookupCustomersRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LookupCustomersRq }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/", name = "LookupCustomersRq")
    public JAXBElement<LookupCustomersRq> createLookupCustomersRq(LookupCustomersRq value) {
        return new JAXBElement<LookupCustomersRq>(_LookupCustomersRq_QNAME, LookupCustomersRq.class, null, value);
    }

}
