
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Денежная наличность
 * 
 * <p>Java class for BRCashType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BRCashType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CashType" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType">
 *             &lt;enumeration value="0"/>
 *             &lt;enumeration value="1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="Nominal" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="Sum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BRCashType")
public class BRCashType {

    @XmlAttribute(name = "CashType", required = true)
    protected String cashType;
    @XmlAttribute(name = "Nominal", required = true)
    protected BigInteger nominal;
    @XmlAttribute(name = "Sum", required = true)
    protected BigInteger sum;

    /**
     * Gets the value of the cashType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCashType() {
        return cashType;
    }

    /**
     * Sets the value of the cashType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCashType(String value) {
        this.cashType = value;
    }

    /**
     * Gets the value of the nominal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNominal() {
        return nominal;
    }

    /**
     * Sets the value of the nominal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNominal(BigInteger value) {
        this.nominal = value;
    }

    /**
     * Gets the value of the sum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSum() {
        return sum;
    }

    /**
     * Sets the value of the sum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSum(BigInteger value) {
        this.sum = value;
    }

}
