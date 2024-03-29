
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information about FTI.
 * 
 * <p>Java class for SEDAccDocInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEDAccDocInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Purpose" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max210TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="PersonalAcc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="DC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="Sum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="ODBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="Acc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="AccDocNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountDocIDType" />
 *       &lt;attribute name="AccDocDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="CreditNum" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max10TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEDAccDocInfo", propOrder = {
    "purpose"
})
public class SEDAccDocInfo {

    @XmlElement(name = "Purpose")
    protected String purpose;
    @XmlAttribute(name = "BIC", required = true)
    protected String bic;
    @XmlAttribute(name = "PersonalAcc", required = true)
    protected String personalAcc;
    @XmlAttribute(name = "DC", required = true)
    protected String dc;
    @XmlAttribute(name = "Sum", required = true)
    protected BigInteger sum;
    @XmlAttribute(name = "ODBIC")
    protected String odbic;
    @XmlAttribute(name = "Acc", required = true)
    protected String acc;
    @XmlAttribute(name = "AccDocNo", required = true)
    protected String accDocNo;
    @XmlAttribute(name = "AccDocDate", required = true)
    protected XMLGregorianCalendar accDocDate;
    @XmlAttribute(name = "CreditNum")
    protected String creditNum;

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurpose(String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the personalAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalAcc() {
        return personalAcc;
    }

    /**
     * Sets the value of the personalAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalAcc(String value) {
        this.personalAcc = value;
    }

    /**
     * Gets the value of the dc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDC() {
        return dc;
    }

    /**
     * Sets the value of the dc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDC(String value) {
        this.dc = value;
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
     * Gets the value of the odbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getODBIC() {
        return odbic;
    }

    /**
     * Sets the value of the odbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setODBIC(String value) {
        this.odbic = value;
    }

    /**
     * Gets the value of the acc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcc() {
        return acc;
    }

    /**
     * Sets the value of the acc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcc(String value) {
        this.acc = value;
    }

    /**
     * Gets the value of the accDocNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccDocNo() {
        return accDocNo;
    }

    /**
     * Sets the value of the accDocNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccDocNo(String value) {
        this.accDocNo = value;
    }

    /**
     * Gets the value of the accDocDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAccDocDate() {
        return accDocDate;
    }

    /**
     * Sets the value of the accDocDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAccDocDate(XMLGregorianCalendar value) {
        this.accDocDate = value;
    }

    /**
     * Gets the value of the creditNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreditNum() {
        return creditNum;
    }

    /**
     * Sets the value of the creditNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreditNum(String value) {
        this.creditNum = value;
    }

}
