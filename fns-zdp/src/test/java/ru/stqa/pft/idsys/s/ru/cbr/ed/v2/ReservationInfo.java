
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Reservation Information.
 * 
 * <p>Java class for ReservationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReservationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="NonCashReservedSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="CashReservedSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReservationInfo")
public class ReservationInfo {

    @XmlAttribute(name = "NonCashReservedSum", required = true)
    protected BigInteger nonCashReservedSum;
    @XmlAttribute(name = "CashReservedSum", required = true)
    protected BigInteger cashReservedSum;

    /**
     * Gets the value of the nonCashReservedSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonCashReservedSum() {
        return nonCashReservedSum;
    }

    /**
     * Sets the value of the nonCashReservedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonCashReservedSum(BigInteger value) {
        this.nonCashReservedSum = value;
    }

    /**
     * Gets the value of the cashReservedSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCashReservedSum() {
        return cashReservedSum;
    }

    /**
     * Sets the value of the cashReservedSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCashReservedSum(BigInteger value) {
        this.cashReservedSum = value;
    }

}
