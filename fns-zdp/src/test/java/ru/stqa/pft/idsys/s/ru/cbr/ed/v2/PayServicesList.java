
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ������ ��������������� �����
 * 
 * <p>Java class for PayServicesList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayServicesList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PayServicesCodeList" type="{urn:cbr-ru:ed:v2.0}PayServicesCodeList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FreeServicesCodeList" type="{urn:cbr-ru:ed:v2.0}FreeServicesCodeList" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="UIS" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *       &lt;attribute name="RegisterNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max6NumberType" />
 *       &lt;attribute name="TotalSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayServicesList", propOrder = {
    "payServicesCodeList",
    "freeServicesCodeList"
})
public class PayServicesList {

    @XmlElement(name = "PayServicesCodeList")
    protected List<PayServicesCodeList> payServicesCodeList;
    @XmlElement(name = "FreeServicesCodeList")
    protected List<FreeServicesCodeList> freeServicesCodeList;
    @XmlAttribute(name = "UIS", required = true)
    protected String uis;
    @XmlAttribute(name = "RegisterNo", required = true)
    protected BigInteger registerNo;
    @XmlAttribute(name = "TotalSum", required = true)
    protected BigInteger totalSum;

    /**
     * Gets the value of the payServicesCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payServicesCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayServicesCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PayServicesCodeList }
     * 
     * 
     */
    public List<PayServicesCodeList> getPayServicesCodeList() {
        if (payServicesCodeList == null) {
            payServicesCodeList = new ArrayList<PayServicesCodeList>();
        }
        return this.payServicesCodeList;
    }

    /**
     * Gets the value of the freeServicesCodeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the freeServicesCodeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFreeServicesCodeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeServicesCodeList }
     * 
     * 
     */
    public List<FreeServicesCodeList> getFreeServicesCodeList() {
        if (freeServicesCodeList == null) {
            freeServicesCodeList = new ArrayList<FreeServicesCodeList>();
        }
        return this.freeServicesCodeList;
    }

    /**
     * Gets the value of the uis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIS() {
        return uis;
    }

    /**
     * Sets the value of the uis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIS(String value) {
        this.uis = value;
    }

    /**
     * Gets the value of the registerNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRegisterNo() {
        return registerNo;
    }

    /**
     * Sets the value of the registerNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRegisterNo(BigInteger value) {
        this.registerNo = value;
    }

    /**
     * Gets the value of the totalSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalSum() {
        return totalSum;
    }

    /**
     * Sets the value of the totalSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalSum(BigInteger value) {
        this.totalSum = value;
    }

}
