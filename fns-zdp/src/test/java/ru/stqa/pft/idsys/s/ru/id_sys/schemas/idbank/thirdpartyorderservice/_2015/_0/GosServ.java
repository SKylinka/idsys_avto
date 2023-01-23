
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.thirdpartyorderservice._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.id_sys.schemas.idbank.common._2012._0.ContactInfo;
import ru.id_sys.schemas.idbank.customer._2015._0.Customer;


/**
 * Запрос госуслуги
 * 
 * <p>Java class for GosServ complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GosServ">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Customer" type="{http://www.id-sys.ru/schemas/idbank/customer/2015/0.01/}Customer" maxOccurs="unbounded"/>
 *         &lt;element name="ContactInfo" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ContactInfo"/>
 *         &lt;element name="serviceFormCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="draft" type="{http://www.id-sys.ru/schemas/idbank/ThirdPartyOrderService/2015/0.01/}Draft" minOccurs="0"/>
 *         &lt;element name="binaryContent" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GosServ", propOrder = {
    "customer",
    "contactInfo",
    "serviceFormCode",
    "serviceCode",
    "draft",
    "binaryContent"
})
public class GosServ {

    @XmlElement(name = "Customer", required = true)
    protected List<Customer> customer;
    @XmlElement(name = "ContactInfo", required = true)
    protected ContactInfo contactInfo;
    @XmlElement(required = true)
    protected String serviceFormCode;
    @XmlElement(required = true)
    protected String serviceCode;
    protected Draft draft;
    protected byte[] binaryContent;

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

    /**
     * Gets the value of the contactInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo }
     *     
     */
    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    /**
     * Sets the value of the contactInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo }
     *     
     */
    public void setContactInfo(ContactInfo value) {
        this.contactInfo = value;
    }

    /**
     * Gets the value of the serviceFormCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceFormCode() {
        return serviceFormCode;
    }

    /**
     * Sets the value of the serviceFormCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceFormCode(String value) {
        this.serviceFormCode = value;
    }

    /**
     * Gets the value of the serviceCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * Sets the value of the serviceCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * Gets the value of the draft property.
     * 
     * @return
     *     possible object is
     *     {@link Draft }
     *     
     */
    public Draft getDraft() {
        return draft;
    }

    /**
     * Sets the value of the draft property.
     * 
     * @param value
     *     allowed object is
     *     {@link Draft }
     *     
     */
    public void setDraft(Draft value) {
        this.draft = value;
    }

    /**
     * Gets the value of the binaryContent property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryContent() {
        return binaryContent;
    }

    /**
     * Sets the value of the binaryContent property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryContent(byte[] value) {
        this.binaryContent = value;
    }

}
