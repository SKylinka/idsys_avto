
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Сумма с признаком отсутствия верхней границы на списание и признаком изменения
 * 
 * <p>Java class for SumWithUnlimitAndInd complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SumWithUnlimitAndInd">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Sum" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="ChangeSum" type="{urn:cbr-ru:ed:leaftypes:v2.0}Indicator1Type" />
 *       &lt;attribute name="UnlimitedFundsMode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SumWithUnlimitAndInd")
public class SumWithUnlimitAndInd {

    @XmlAttribute(name = "Sum")
    protected BigInteger sum;
    @XmlAttribute(name = "ChangeSum")
    protected Boolean changeSum;
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
     * Gets the value of the changeSum property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChangeSum() {
        return changeSum;
    }

    /**
     * Sets the value of the changeSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChangeSum(Boolean value) {
        this.changeSum = value;
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
