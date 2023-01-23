
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ������� � ��� � ������� ������������� ���.
 * 
 * <p>Java class for FPSTurnoverType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSTurnoverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FPSCreditSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="FPSDebetSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSTurnoverType")
public class FPSTurnoverType {

    @XmlAttribute(name = "FPSCreditSum", required = true)
    protected BigInteger fpsCreditSum;
    @XmlAttribute(name = "FPSDebetSum", required = true)
    protected BigInteger fpsDebetSum;

    /**
     * Gets the value of the fpsCreditSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFPSCreditSum() {
        return fpsCreditSum;
    }

    /**
     * Sets the value of the fpsCreditSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFPSCreditSum(BigInteger value) {
        this.fpsCreditSum = value;
    }

    /**
     * Gets the value of the fpsDebetSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFPSDebetSum() {
        return fpsDebetSum;
    }

    /**
     * Sets the value of the fpsDebetSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFPSDebetSum(BigInteger value) {
        this.fpsDebetSum = value;
    }

}
