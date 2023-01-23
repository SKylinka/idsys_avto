
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������� ����������
 * 
 * <p>Java class for ShortPayeeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShortPayeeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxPaytSum" type="{urn:cbr-ru:ed:v2.0}SumWithUnlimit" minOccurs="0"/>
 *         &lt;element name="TotalPaytsSum" type="{urn:cbr-ru:ed:v2.0}SumWithUnlimit" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PayeeBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="PayeeUIS" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShortPayeeInfo", propOrder = {
    "maxPaytSum",
    "totalPaytsSum"
})
public class ShortPayeeInfo {

    @XmlElement(name = "MaxPaytSum")
    protected SumWithUnlimit maxPaytSum;
    @XmlElement(name = "TotalPaytsSum")
    protected SumWithUnlimit totalPaytsSum;
    @XmlAttribute(name = "PayeeBIC")
    protected String payeeBIC;
    @XmlAttribute(name = "PayeeUIS")
    protected String payeeUIS;

    /**
     * Gets the value of the maxPaytSum property.
     * 
     * @return
     *     possible object is
     *     {@link SumWithUnlimit }
     *     
     */
    public SumWithUnlimit getMaxPaytSum() {
        return maxPaytSum;
    }

    /**
     * Sets the value of the maxPaytSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumWithUnlimit }
     *     
     */
    public void setMaxPaytSum(SumWithUnlimit value) {
        this.maxPaytSum = value;
    }

    /**
     * Gets the value of the totalPaytsSum property.
     * 
     * @return
     *     possible object is
     *     {@link SumWithUnlimit }
     *     
     */
    public SumWithUnlimit getTotalPaytsSum() {
        return totalPaytsSum;
    }

    /**
     * Sets the value of the totalPaytsSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link SumWithUnlimit }
     *     
     */
    public void setTotalPaytsSum(SumWithUnlimit value) {
        this.totalPaytsSum = value;
    }

    /**
     * Gets the value of the payeeBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeBIC() {
        return payeeBIC;
    }

    /**
     * Sets the value of the payeeBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeBIC(String value) {
        this.payeeBIC = value;
    }

    /**
     * Gets the value of the payeeUIS property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeUIS() {
        return payeeUIS;
    }

    /**
     * Sets the value of the payeeUIS property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeUIS(String value) {
        this.payeeUIS = value;
    }

}
