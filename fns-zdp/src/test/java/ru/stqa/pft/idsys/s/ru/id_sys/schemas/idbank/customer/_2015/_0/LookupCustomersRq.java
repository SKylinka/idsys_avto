
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.Message;



/**
 * Запрос сведений о клиентах
 * 
 * <p>Java class for LookupCustomersRq complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LookupCustomersRq">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Message">
 *       &lt;sequence>
 *         &lt;element name="DataFilter">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FilterItem" maxOccurs="unbounded">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}CustomerDataType">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="Customers">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Customer" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}Customer" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="taskID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LookupCustomersRq", propOrder = {
    "dataFilter",
    "customers",
    "taskID"
})
public class LookupCustomersRq
    extends Message
{

    @XmlElement(name = "DataFilter", required = true)
    protected String dataFilter;
    @XmlElement(name = "Customers")
    protected Customer customers;
    protected String taskID;

    /**
     * Gets the value of the dataFilter property.
     * 
     * @return
     *     possible object is
     *     {@link LookupCustomersRq.DataFilter }
     *     
     */
    public String getDataFilter() {
        return dataFilter;
    }

    /**
     * Sets the value of the dataFilter property.
     *
     * @param value
     *     allowed object is
     *     {@link DataFilter }
     *     
     */
    public void setDataFilter(String value) {
        this.dataFilter = value;
    }

    /**
     * Gets the value of the customers property.
     * 
     * @return
     *     possible object is
     *     {@link LookupCustomersRq.Customers }
     *     
     */
    public Customer getCustomers() {
        return customers;
    }

    /**
     * Sets the value of the customers property.
     *
     * @param value
     *     allowed object is
     *     {@link Customers }
     *     
     */
    public void setCustomers(Customer value) {
        this.customers = value;
    }

    /**
     * Gets the value of the taskID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaskID() {
        return taskID;
    }

    /**
     * Sets the value of the taskID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaskID(String value) {
        this.taskID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Customer" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}Customer" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "customer"
    })
    public static class Customers {

        @XmlElement(name = "Customer", required = true)
        protected List<Customer> customer;

        /**
         * Gets the value of the customer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Customer }
         * 
         * 
         */
        public List<Customer> getCustomer() {
            if (customer == null) {
                customer = new ArrayList<Customer>();
            }
            return this.customer;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="FilterItem" maxOccurs="unbounded">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}CustomerDataType">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "filterItem"
    })
    public static class DataFilter {

        @XmlElement(name = "FilterItem", required = true)
        protected List<CustomerDataType> filterItem;

        /**
         * Gets the value of the filterItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the filterItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFilterItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomerDataType }
         * 
         * 
         */
        public List<CustomerDataType> getFilterItem() {
            if (filterItem == null) {
                filterItem = new ArrayList<CustomerDataType>();
            }
            return this.filterItem;
        }

    }

}
