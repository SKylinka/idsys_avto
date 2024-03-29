
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Total Amount of Arrest (Limitation) and Total Unpaid Amount of Arrest (Limitation) on account.
 * 
 * <p>Java class for ArrestInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrestInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="TotalAmount" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="IndeterminateAmountFlag" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrestInfo")
public class ArrestInfo {

    @XmlAttribute(name = "TotalAmount")
    protected BigInteger totalAmount;
    @XmlAttribute(name = "IndeterminateAmountFlag", required = true)
    protected boolean indeterminateAmountFlag;

    /**
     * Gets the value of the totalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the value of the totalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalAmount(BigInteger value) {
        this.totalAmount = value;
    }

    /**
     * Gets the value of the indeterminateAmountFlag property.
     * 
     */
    public boolean isIndeterminateAmountFlag() {
        return indeterminateAmountFlag;
    }

    /**
     * Sets the value of the indeterminateAmountFlag property.
     * 
     */
    public void setIndeterminateAmountFlag(boolean value) {
        this.indeterminateAmountFlag = value;
    }

}
