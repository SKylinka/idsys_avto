
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * ���������� � �����
 * 
 * <p>Java class for SEDAccInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SEDAccInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="PBRBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="OverdueDebetAcc" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="OverdueDebetBal" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="OverduePercentAcc" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="OverduePercentBal" type="{urn:cbr-ru:ed:leaftypes:v2.0}KopeckAmountType" />
 *       &lt;attribute name="LoanAcc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="PercentAcc" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="CreditNum" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max10TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SEDAccInfo")
public class SEDAccInfo {

    @XmlAttribute(name = "PBRBIC", required = true)
    protected String pbrbic;
    @XmlAttribute(name = "OverdueDebetAcc")
    protected String overdueDebetAcc;
    @XmlAttribute(name = "OverdueDebetBal")
    protected BigInteger overdueDebetBal;
    @XmlAttribute(name = "OverduePercentAcc")
    protected String overduePercentAcc;
    @XmlAttribute(name = "OverduePercentBal")
    protected BigInteger overduePercentBal;
    @XmlAttribute(name = "LoanAcc", required = true)
    protected String loanAcc;
    @XmlAttribute(name = "PercentAcc", required = true)
    protected String percentAcc;
    @XmlAttribute(name = "CreditNum", required = true)
    protected String creditNum;

    /**
     * Gets the value of the pbrbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPBRBIC() {
        return pbrbic;
    }

    /**
     * Sets the value of the pbrbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPBRBIC(String value) {
        this.pbrbic = value;
    }

    /**
     * Gets the value of the overdueDebetAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverdueDebetAcc() {
        return overdueDebetAcc;
    }

    /**
     * Sets the value of the overdueDebetAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverdueDebetAcc(String value) {
        this.overdueDebetAcc = value;
    }

    /**
     * Gets the value of the overdueDebetBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverdueDebetBal() {
        return overdueDebetBal;
    }

    /**
     * Sets the value of the overdueDebetBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverdueDebetBal(BigInteger value) {
        this.overdueDebetBal = value;
    }

    /**
     * Gets the value of the overduePercentAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverduePercentAcc() {
        return overduePercentAcc;
    }

    /**
     * Sets the value of the overduePercentAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverduePercentAcc(String value) {
        this.overduePercentAcc = value;
    }

    /**
     * Gets the value of the overduePercentBal property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOverduePercentBal() {
        return overduePercentBal;
    }

    /**
     * Sets the value of the overduePercentBal property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOverduePercentBal(BigInteger value) {
        this.overduePercentBal = value;
    }

    /**
     * Gets the value of the loanAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoanAcc() {
        return loanAcc;
    }

    /**
     * Sets the value of the loanAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoanAcc(String value) {
        this.loanAcc = value;
    }

    /**
     * Gets the value of the percentAcc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentAcc() {
        return percentAcc;
    }

    /**
     * Sets the value of the percentAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentAcc(String value) {
        this.percentAcc = value;
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
