
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Balance Sweeping Destination Account.
 * 
 * <p>Java class for BalanceSweepingAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BalanceSweepingAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DailyTransfer" type="{urn:cbr-ru:ed:v2.0}DailyTransfer" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="Account" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceSweepingAccount", propOrder = {
    "dailyTransfer"
})
public class BalanceSweepingAccount {

    @XmlElement(name = "DailyTransfer")
    protected DailyTransfer dailyTransfer;
    @XmlAttribute(name = "BIC", required = true)
    protected String bic;
    @XmlAttribute(name = "Account", required = true)
    protected String account;

    /**
     * Gets the value of the dailyTransfer property.
     * 
     * @return
     *     possible object is
     *     {@link DailyTransfer }
     *     
     */
    public DailyTransfer getDailyTransfer() {
        return dailyTransfer;
    }

    /**
     * Sets the value of the dailyTransfer property.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyTransfer }
     *     
     */
    public void setDailyTransfer(DailyTransfer value) {
        this.dailyTransfer = value;
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

}
