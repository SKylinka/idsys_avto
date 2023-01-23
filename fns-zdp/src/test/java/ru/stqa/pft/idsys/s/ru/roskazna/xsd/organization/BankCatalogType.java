
package ru.stqa.pft.idsys.s.ru.roskazna.xsd.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.roskazna.xsd.common.AddressesType;
import ru.roskazna.xsd.common.ContactsType;


/**
 * ������ ����� ��� �������� �����
 * 
 * <p>Java class for BankCatalogType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BankCatalogType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="CorrespondentBankAccount" type="{http://roskazna.ru/xsd/Common}AccountNumType" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://roskazna.ru/xsd/Common}AddressesType" minOccurs="0"/>
 *         &lt;element name="Contacts" type="{http://roskazna.ru/xsd/Common}ContactsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="100"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BIK" use="required" type="{http://roskazna.ru/xsd/Common}BIK_Type" />
 *       &lt;attribute name="SWIFT" type="{http://roskazna.ru/xsd/Common}SWIFT_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankCatalogType", propOrder = {
    "correspondentBankAccount",
    "address",
    "contacts"
})
public class BankCatalogType {

    @XmlElement(name = "CorrespondentBankAccount")
    protected String correspondentBankAccount;
    @XmlElement(name = "Address")
    protected AddressesType address;
    @XmlElement(name = "Contacts")
    protected ContactsType contacts;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "BIK", required = true)
    protected String bik;
    @XmlAttribute(name = "SWIFT")
    protected String swift;

    /**
     * Gets the value of the correspondentBankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorrespondentBankAccount() {
        return correspondentBankAccount;
    }

    /**
     * Sets the value of the correspondentBankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorrespondentBankAccount(String value) {
        this.correspondentBankAccount = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link AddressesType }
     *     
     */
    public AddressesType getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressesType }
     *     
     */
    public void setAddress(AddressesType value) {
        this.address = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the bik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIK() {
        return bik;
    }

    /**
     * Sets the value of the bik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIK(String value) {
        this.bik = value;
    }

    /**
     * Gets the value of the swift property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFT() {
        return swift;
    }

    /**
     * Sets the value of the swift property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFT(String value) {
        this.swift = value;
    }

}
