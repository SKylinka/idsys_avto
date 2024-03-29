
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.LimitType;


/**
 * Value and Usage of Limit.
 * 
 * <p>Java class for LimitInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="LimitType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}LimitType" />
 *       &lt;attribute name="Value" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="PayerBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="AggrementID" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitIdentifierType" />
 *       &lt;attribute name="Utilization" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="BIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="Account" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="UID" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitInfoType")
public class LimitInfoType {

    @XmlAttribute(name = "LimitType", required = true)
    protected LimitType limitType;
    @XmlAttribute(name = "Value", required = true)
    protected BigInteger value;
    @XmlAttribute(name = "PayerBIC")
    protected String payerBIC;
    @XmlAttribute(name = "AggrementID")
    protected String aggrementID;
    @XmlAttribute(name = "Utilization")
    protected BigInteger utilization;
    @XmlAttribute(name = "BIC")
    protected String bic;
    @XmlAttribute(name = "Account")
    protected String account;
    @XmlAttribute(name = "UID")
    protected String uid;

    /**
     * Gets the value of the limitType property.
     * 
     * @return
     *     possible object is
     *     {@link LimitType }
     *     
     */
    public LimitType getLimitType() {
        return limitType;
    }

    /**
     * Sets the value of the limitType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitType }
     *     
     */
    public void setLimitType(LimitType value) {
        this.limitType = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setValue(BigInteger value) {
        this.value = value;
    }

    /**
     * Gets the value of the payerBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayerBIC() {
        return payerBIC;
    }

    /**
     * Sets the value of the payerBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayerBIC(String value) {
        this.payerBIC = value;
    }

    /**
     * Gets the value of the aggrementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggrementID() {
        return aggrementID;
    }

    /**
     * Sets the value of the aggrementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggrementID(String value) {
        this.aggrementID = value;
    }

    /**
     * Gets the value of the utilization property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUtilization() {
        return utilization;
    }

    /**
     * Sets the value of the utilization property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUtilization(BigInteger value) {
        this.utilization = value;
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

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

}
