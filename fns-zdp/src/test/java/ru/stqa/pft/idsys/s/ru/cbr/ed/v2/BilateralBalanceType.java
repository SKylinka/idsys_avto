
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Bilateral gross balances between accounts which belongs to the one balance sheet.
 * 
 * <p>Java class for BilateralBalanceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BilateralBalanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BICA" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="AccA" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="BICB" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="AccB" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="DebitTurnOver" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}NotNegativeKopeckAmountType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BilateralBalanceType")
public class BilateralBalanceType {

    @XmlAttribute(name = "BICA", required = true)
    protected String bica;
    @XmlAttribute(name = "AccA", required = true)
    protected String accA;
    @XmlAttribute(name = "BICB", required = true)
    protected String bicb;
    @XmlAttribute(name = "AccB", required = true)
    protected String accB;
    @XmlAttribute(name = "DebitTurnOver", required = true)
    protected BigInteger debitTurnOver;

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
     * Gets the value of the accA property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccA() {
        return accA;
    }

    /**
     * Sets the value of the accA property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccA(String value) {
        this.accA = value;
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
     * Gets the value of the accB property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccB() {
        return accB;
    }

    /**
     * Sets the value of the accB property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccB(String value) {
        this.accB = value;
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

}
