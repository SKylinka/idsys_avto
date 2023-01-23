
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * IOCL (limit of intraday credit) Value and Usage.
 * 
 * <p>Java class for LimitInfoBrfType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitInfoBrfType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Value" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="Utilization" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitInfoBrfType")
public class LimitInfoBrfType {

    @XmlAttribute(name = "Value", required = true)
    protected BigInteger value;
    @XmlAttribute(name = "Utilization", required = true)
    protected BigInteger utilization;

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

}
