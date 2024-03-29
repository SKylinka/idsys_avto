
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Financial Institution Attributes in FTI.
 * 
 * <p>Java class for FinOrg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FinOrg">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max140TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="SWBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICSWIFTIDType" />
 *       &lt;attribute name="BankAccount" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberSWIFTIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FinOrg", propOrder = {
    "name"
})
public class FinOrg {

    @XmlElement(name = "Name")
    protected String name;
    @XmlAttribute(name = "BIC")
    protected String bic;
    @XmlAttribute(name = "SWBIC")
    protected String swbic;
    @XmlAttribute(name = "BankAccount")
    protected String bankAccount;

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
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the swbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWBIC() {
        return swbic;
    }

    /**
     * Sets the value of the swbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWBIC(String value) {
        this.swbic = value;
    }

    /**
     * Gets the value of the bankAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankAccount() {
        return bankAccount;
    }

    /**
     * Sets the value of the bankAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankAccount(String value) {
        this.bankAccount = value;
    }

}
