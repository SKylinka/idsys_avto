
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Bilateral gross balances between accounts which belongs to the one balance sheet.
 * 
 * <p>Java class for FPSBilateralBalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FPSBilateralBalanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="RecordID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}RecordIDType" />
 *       &lt;attribute name="BICA" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="AccountA" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="BICB" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="AccountB" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="DebitTurnOver" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *       &lt;attribute name="OperationQuantity" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDQuantityType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FPSBilateralBalanceType")
public class FPSBilateralBalanceType {

    @XmlAttribute(name = "RecordID", required = true)
    protected String recordID;
    @XmlAttribute(name = "BICA", required = true)
    protected String bica;
    @XmlAttribute(name = "AccountA", required = true)
    protected String accountA;
    @XmlAttribute(name = "BICB", required = true)
    protected String bicb;
    @XmlAttribute(name = "AccountB", required = true)
    protected String accountB;
    @XmlAttribute(name = "DebitTurnOver", required = true)
    protected BigInteger debitTurnOver;
    @XmlAttribute(name = "OperationQuantity", required = true)
    protected BigInteger operationQuantity;

    /**
     * Gets the value of the recordID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordID() {
        return recordID;
    }

    /**
     * Sets the value of the recordID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordID(String value) {
        this.recordID = value;
    }

    /**
     * Gets the value of the bica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICA() {
        return bica;
    }

    /**
     * Sets the value of the bica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICA(String value) {
        this.bica = value;
    }

    /**
     * Gets the value of the accountA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountA() {
        return accountA;
    }

    /**
     * Sets the value of the accountA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountA(String value) {
        this.accountA = value;
    }

    /**
     * Gets the value of the bicb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICB() {
        return bicb;
    }

    /**
     * Sets the value of the bicb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICB(String value) {
        this.bicb = value;
    }

    /**
     * Gets the value of the accountB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountB() {
        return accountB;
    }

    /**
     * Sets the value of the accountB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountB(String value) {
        this.accountB = value;
    }

    /**
     * Gets the value of the debitTurnOver property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDebitTurnOver() {
        return debitTurnOver;
    }

    /**
     * Sets the value of the debitTurnOver property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDebitTurnOver(BigInteger value) {
        this.debitTurnOver = value;
    }

    /**
     * Gets the value of the operationQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOperationQuantity() {
        return operationQuantity;
    }

    /**
     * Sets the value of the operationQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOperationQuantity(BigInteger value) {
        this.operationQuantity = value;
    }

}
