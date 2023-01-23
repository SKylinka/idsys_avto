
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.esia._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Çàïðîñ ðåãèñòðàöèè áèîìåòðè÷åñêèõ äàííûõ
 * 
 * <p>Java class for BiometricDataRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BiometricDataRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BranchId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ÑlientId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PersonId" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}PersonIdType"/>
 *         &lt;element name="Contacts" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}ContactsType" minOccurs="0"/>
 *         &lt;element name="BiometricData" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}BiometricDataType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonMetadata" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}MetadataType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiometricDataRequestType", propOrder = {
    "id",
    "branchId",
    "\u0441lientId",
    "personId",
    "contacts",
    "biometricData",
    "personMetadata"
})
public class BiometricDataRequestType {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "BranchId")
    protected String branchId;
    @XmlElement(name = "\u0421lientId")
    protected String ñlientId;
    @XmlElement(name = "PersonId", required = true)
    protected PersonIdType personId;
    @XmlElement(name = "Contacts")
    protected ContactsType contacts;
    @XmlElement(name = "BiometricData")
    protected List<BiometricDataType> biometricData;
    @XmlElement(name = "PersonMetadata")
    protected List<MetadataType> personMetadata;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the branchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBranchId() {
        return branchId;
    }

    /**
     * Sets the value of the branchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBranchId(String value) {
        this.branchId = value;
    }

    /**
     * Gets the value of the ñlientId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getÑlientId() {
        return ñlientId;
    }

    /**
     * Sets the value of the ñlientId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setÑlientId(String value) {
        this.ñlientId = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdType }
     *     
     */
    public PersonIdType getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdType }
     *     
     */
    public void setPersonId(PersonIdType value) {
        this.personId = value;
    }

    /**
     * Gets the value of the contacts property.
     * 
     * @return
     *     possible object is
     *     {@link ContactsType }
     *     
     */
    public ContactsType getContacts() {
        return contacts;
    }

    /**
     * Sets the value of the contacts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactsType }
     *     
     */
    public void setContacts(ContactsType value) {
        this.contacts = value;
    }

    /**
     * Gets the value of the biometricData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biometricData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiometricData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiometricDataType }
     * 
     * 
     */
    public List<BiometricDataType> getBiometricData() {
        if (biometricData == null) {
            biometricData = new ArrayList<BiometricDataType>();
        }
        return this.biometricData;
    }

    /**
     * Gets the value of the personMetadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the personMetadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPersonMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MetadataType }
     * 
     * 
     */
    public List<MetadataType> getPersonMetadata() {
        if (personMetadata == null) {
            personMetadata = new ArrayList<MetadataType>();
        }
        return this.personMetadata;
    }

}
