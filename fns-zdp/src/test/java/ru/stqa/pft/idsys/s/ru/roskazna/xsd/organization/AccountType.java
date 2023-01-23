
package ru.stqa.pft.idsys.s.ru.roskazna.xsd.organization;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Описание счёта организации / банка
 * 
 * <p>Java class for AccountType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Account" type="{http://roskazna.ru/xsd/Common}AccountNumType" minOccurs="0"/>
 *         &lt;element name="SubAccount" type="{http://roskazna.ru/xsd/Common}AccountNumType" minOccurs="0"/>
 *         &lt;element name="Bank" type="{http://roskazna.ru/xsd/Organization}BankType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" default="1">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="blocked" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountType", propOrder = {
    "account",
    "subAccount",
    "bank"
})
public class AccountType {

    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "SubAccount")
    protected String subAccount;
    @XmlElement(name = "Bank")
    protected BankType bank;
    @XmlAttribute(name = "kind")
    protected String kind;
    @XmlAttribute(name = "category")
    protected String category;
    @XmlAttribute(name = "blocked")
    protected String blocked;

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the subAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubAccount() {
        return subAccount;
    }

    /**
     * Sets the value of the subAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubAccount(String value) {
        this.subAccount = value;
    }

    /**
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link BankType }
     *     
     */
    public BankType getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankType }
     *     
     */
    public void setBank(BankType value) {
        this.bank = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        if (kind == null) {
            return "1";
        } else {
            return kind;
        }
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * Gets the value of the blocked property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlocked() {
        return blocked;
    }

    /**
     * Sets the value of the blocked property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlocked(String value) {
        this.blocked = value;
    }

}
