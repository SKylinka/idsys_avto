
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Beneficiary Attributes.
 * 
 * <p>Java class for PayeeRU complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeRU">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max160TextType"/>
 *         &lt;element name="Bank" type="{urn:cbr-ru:ed:v2.0}BankRU"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PersonalAcc" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="INN" type="{urn:cbr-ru:ed:leaftypes:v2.0}INNIDTextType" />
 *       &lt;attribute name="KPP" type="{urn:cbr-ru:ed:leaftypes:v2.0}KPPIDTextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayeeRU", propOrder = {
    "name",
    "bank"
})
public class PayeeRU {

    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "Bank", required = true)
    protected BankRU bank;
    @XmlAttribute(name = "PersonalAcc")
    protected String personalAcc;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "KPP")
    protected String kpp;

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
     * Gets the value of the bank property.
     * 
     * @return
     *     possible object is
     *     {@link BankRU }
     *     
     */
    public BankRU getBank() {
        return bank;
    }

    /**
     * Sets the value of the bank property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankRU }
     *     
     */
    public void setBank(BankRU value) {
        this.bank = value;
    }

    /**
     * Gets the value of the personalAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAcc() {
        return personalAcc;
    }

    /**
     * Sets the value of the personalAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAcc(String value) {
        this.personalAcc = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the kpp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKPP() {
        return kpp;
    }

    /**
     * Sets the value of the kpp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKPP(String value) {
        this.kpp = value;
    }

}
