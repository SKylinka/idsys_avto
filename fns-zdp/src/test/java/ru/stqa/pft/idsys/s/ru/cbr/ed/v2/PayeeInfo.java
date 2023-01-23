
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ��������� ����������
 * 
 * <p>Java class for PayeeInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayeeInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxPaytSum" type="{urn:cbr-ru:ed:v2.0}SumWithUnlimit" minOccurs="0"/>
 *         &lt;element name="TotalPaytsSum" type="{urn:cbr-ru:ed:v2.0}SumWithUnlimit" minOccurs="0"/>
 *         &lt;element name="PayeeAccInfo" type="{urn:cbr-ru:ed:v2.0}PayeeAccInfo" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "PayeeInfo", propOrder = {
    "maxPaytSum",
    "totalPaytsSum",
    "payeeAccInfo"
})
public class PayeeInfo {

    @XmlElement(name = "MaxPaytSum")
    protected SumWithUnlimit maxPaytSum;
    @XmlElement(name = "TotalPaytsSum")
    protected SumWithUnlimit totalPaytsSum;
    @XmlElement(name = "PayeeAccInfo")
    protected List<PayeeAccInfo> payeeAccInfo;
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
     * Gets the value of the payeeAccInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payeeAccInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayeeAccInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayeeAccInfo }
     * 
     * 
     */
    public List<PayeeAccInfo> getPayeeAccInfo() {
        if (payeeAccInfo == null) {
            payeeAccInfo = new ArrayList<PayeeAccInfo>();
        }
        return this.payeeAccInfo;
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
