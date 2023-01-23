
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * ��������� ������������� ��������
 * 
 * <p>Java class for DepositInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DepositInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ExecReqNum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max20TextType" />
 *       &lt;attribute name="ReqDateTime" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateTimeType" />
 *       &lt;attribute name="DepositConsDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="DepositConsNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max10TextType" />
 *       &lt;attribute name="DepositOpDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="DepositOpMethod" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="DepositOpKind" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max5TextType" />
 *       &lt;attribute name="AttractDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="ReturnDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="ApplicationSum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="OrgRegNum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BankDKOIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DepositInfo")
public class DepositInfo {

    @XmlAttribute(name = "ExecReqNum", required = true)
    protected String execReqNum;
    @XmlAttribute(name = "ReqDateTime", required = true)
    protected XMLGregorianCalendar reqDateTime;
    @XmlAttribute(name = "DepositConsDate", required = true)
    protected XMLGregorianCalendar depositConsDate;
    @XmlAttribute(name = "DepositConsNo", required = true)
    protected String depositConsNo;
    @XmlAttribute(name = "DepositOpDate", required = true)
    protected XMLGregorianCalendar depositOpDate;
    @XmlAttribute(name = "DepositOpMethod", required = true)
    protected String depositOpMethod;
    @XmlAttribute(name = "DepositOpKind", required = true)
    protected String depositOpKind;
    @XmlAttribute(name = "AttractDate", required = true)
    protected XMLGregorianCalendar attractDate;
    @XmlAttribute(name = "ReturnDate")
    protected XMLGregorianCalendar returnDate;
    @XmlAttribute(name = "ApplicationSum", required = true)
    protected BigInteger applicationSum;
    @XmlAttribute(name = "OrgRegNum", required = true)
    protected String orgRegNum;

    /**
     * Gets the value of the execReqNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecReqNum() {
        return execReqNum;
    }

    /**
     * Sets the value of the execReqNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecReqNum(String value) {
        this.execReqNum = value;
    }

    /**
     * Gets the value of the reqDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReqDateTime() {
        return reqDateTime;
    }

    /**
     * Sets the value of the reqDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReqDateTime(XMLGregorianCalendar value) {
        this.reqDateTime = value;
    }

    /**
     * Gets the value of the depositConsDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositConsDate() {
        return depositConsDate;
    }

    /**
     * Sets the value of the depositConsDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositConsDate(XMLGregorianCalendar value) {
        this.depositConsDate = value;
    }

    /**
     * Gets the value of the depositConsNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositConsNo() {
        return depositConsNo;
    }

    /**
     * Sets the value of the depositConsNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositConsNo(String value) {
        this.depositConsNo = value;
    }

    /**
     * Gets the value of the depositOpDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepositOpDate() {
        return depositOpDate;
    }

    /**
     * Sets the value of the depositOpDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepositOpDate(XMLGregorianCalendar value) {
        this.depositOpDate = value;
    }

    /**
     * Gets the value of the depositOpMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositOpMethod() {
        return depositOpMethod;
    }

    /**
     * Sets the value of the depositOpMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositOpMethod(String value) {
        this.depositOpMethod = value;
    }

    /**
     * Gets the value of the depositOpKind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositOpKind() {
        return depositOpKind;
    }

    /**
     * Sets the value of the depositOpKind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositOpKind(String value) {
        this.depositOpKind = value;
    }

    /**
     * Gets the value of the attractDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAttractDate() {
        return attractDate;
    }

    /**
     * Sets the value of the attractDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAttractDate(XMLGregorianCalendar value) {
        this.attractDate = value;
    }

    /**
     * Gets the value of the returnDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReturnDate() {
        return returnDate;
    }

    /**
     * Sets the value of the returnDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReturnDate(XMLGregorianCalendar value) {
        this.returnDate = value;
    }

    /**
     * Gets the value of the applicationSum property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getApplicationSum() {
        return applicationSum;
    }

    /**
     * Sets the value of the applicationSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setApplicationSum(BigInteger value) {
        this.applicationSum = value;
    }

    /**
     * Gets the value of the orgRegNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgRegNum() {
        return orgRegNum;
    }

    /**
     * Sets the value of the orgRegNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgRegNum(String value) {
        this.orgRegNum = value;
    }

}
