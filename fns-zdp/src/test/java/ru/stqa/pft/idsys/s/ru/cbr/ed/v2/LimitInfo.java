
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация об устанавливаемом лимите
 * 
 * <p>Java class for LimitInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PURBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="LimitSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitInfo")
public class LimitInfo {

    @XmlAttribute(name = "PURBIC")
    protected String purbic;
    @XmlAttribute(name = "LimitSum", required = true)
    protected BigInteger limitSum;

    /**
     * Gets the value of the purbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPURBIC() {
        return purbic;
    }

    /**
     * Sets the value of the purbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPURBIC(String value) {
        this.purbic = value;
    }

    /**
     * Gets the value of the limitSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLimitSum() {
        return limitSum;
    }

    /**
     * Sets the value of the limitSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLimitSum(BigInteger value) {
        this.limitSum = value;
    }

}
