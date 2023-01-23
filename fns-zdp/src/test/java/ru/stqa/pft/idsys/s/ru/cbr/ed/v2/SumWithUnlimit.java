
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сумма с признаком отсутствия верхней границы на списание
 * 
 * <p>Java class for SumWithUnlimit complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumWithUnlimit">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Sum" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="UnlimitedFundsMode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumWithUnlimit")
public class SumWithUnlimit {

    @XmlAttribute(name = "Sum")
    protected BigInteger sum;
    @XmlAttribute(name = "UnlimitedFundsMode", required = true)
    protected String unlimitedFundsMode;

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

    /**
     * Gets the value of the unlimitedFundsMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnlimitedFundsMode() {
        return unlimitedFundsMode;
    }

    /**
     * Sets the value of the unlimitedFundsMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnlimitedFundsMode(String value) {
        this.unlimitedFundsMode = value;
    }

}
