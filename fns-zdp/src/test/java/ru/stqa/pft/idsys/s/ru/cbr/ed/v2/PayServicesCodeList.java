
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ������ ��������������� ������� ����� �� �����
 * 
 * <p>Java class for PayServicesCodeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PayServicesCodeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ServicesCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="ReceiverSWIFTBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}UICIDType" />
 *       &lt;attribute name="ServicesDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="ServicesQuantity" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max9QuantityType" />
 *       &lt;attribute name="ServicesRate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="Sum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="ARMNo" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitIdentifierType" />
 *       &lt;attribute name="UIS" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PayServicesCodeList")
public class PayServicesCodeList {

    @XmlAttribute(name = "ServicesCode", required = true)
    protected String servicesCode;
    @XmlAttribute(name = "ReceiverSWIFTBIC")
    protected String receiverSWIFTBIC;
    @XmlAttribute(name = "ServicesDate", required = true)
    protected XMLGregorianCalendar servicesDate;
    @XmlAttribute(name = "ServicesQuantity", required = true)
    protected BigInteger servicesQuantity;
    @XmlAttribute(name = "ServicesRate", required = true)
    protected BigInteger servicesRate;
    @XmlAttribute(name = "Sum", required = true)
    protected BigInteger sum;
    @XmlAttribute(name = "ARMNo")
    protected String armNo;
    @XmlAttribute(name = "UIS")
    protected String uis;

    /**
     * Gets the value of the servicesCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServicesCode() {
        return servicesCode;
    }

    /**
     * Sets the value of the servicesCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServicesCode(String value) {
        this.servicesCode = value;
    }

    /**
     * Gets the value of the receiverSWIFTBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceiverSWIFTBIC() {
        return receiverSWIFTBIC;
    }

    /**
     * Sets the value of the receiverSWIFTBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceiverSWIFTBIC(String value) {
        this.receiverSWIFTBIC = value;
    }

    /**
     * Gets the value of the servicesDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getServicesDate() {
        return servicesDate;
    }

    /**
     * Sets the value of the servicesDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setServicesDate(XMLGregorianCalendar value) {
        this.servicesDate = value;
    }

    /**
     * Gets the value of the servicesQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServicesQuantity() {
        return servicesQuantity;
    }

    /**
     * Sets the value of the servicesQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServicesQuantity(BigInteger value) {
        this.servicesQuantity = value;
    }

    /**
     * Gets the value of the servicesRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getServicesRate() {
        return servicesRate;
    }

    /**
     * Sets the value of the servicesRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setServicesRate(BigInteger value) {
        this.servicesRate = value;
    }

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
     * Gets the value of the armNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARMNo() {
        return armNo;
    }

    /**
     * Sets the value of the armNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARMNo(String value) {
        this.armNo = value;
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

}
