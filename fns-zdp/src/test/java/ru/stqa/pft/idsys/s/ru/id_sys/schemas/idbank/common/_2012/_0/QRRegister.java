
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос регистрации QR-кода
 * 
 * <p>Java class for QR_Register complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QR_Register">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UL_Id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MerchantId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="QrTtl" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PaymentPurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QrcType" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}QrcType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QR_Register", propOrder = {
    "ulId",
    "account",
    "merchantId",
    "amount",
    "qrTtl",
    "paymentPurpose",
    "qrcType"
})
public class QRRegister {

    @XmlElement(name = "UL_Id")
    protected String ulId;
    @XmlElement(name = "Account", required = true)
    protected String account;
    @XmlElement(name = "MerchantId", required = true)
    protected String merchantId;
    @XmlElement(name = "Amount")
    protected Integer amount;
    @XmlElement(name = "QrTtl")
    protected Integer qrTtl;
    @XmlElement(name = "PaymentPurpose")
    protected String paymentPurpose;
    @XmlElement(name = "QrcType", required = true)
    @XmlSchemaType(name = "string")
    protected QrcType qrcType;

    /**
     * Gets the value of the ulId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULId() {
        return ulId;
    }

    /**
     * Sets the value of the ulId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULId(String value) {
        this.ulId = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the merchantId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMerchantId() {
        return merchantId;
    }

    /**
     * Sets the value of the merchantId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMerchantId(String value) {
        this.merchantId = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAmount(Integer value) {
        this.amount = value;
    }

    /**
     * Gets the value of the qrTtl property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getQrTtl() {
        return qrTtl;
    }

    /**
     * Sets the value of the qrTtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setQrTtl(Integer value) {
        this.qrTtl = value;
    }

    /**
     * Gets the value of the paymentPurpose property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentPurpose() {
        return paymentPurpose;
    }

    /**
     * Sets the value of the paymentPurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentPurpose(String value) {
        this.paymentPurpose = value;
    }

    /**
     * Gets the value of the qrcType property.
     * 
     * @return
     *     possible object is
     *     {@link QrcType }
     *     
     */
    public QrcType getQrcType() {
        return qrcType;
    }

    /**
     * Sets the value of the qrcType property.
     * 
     * @param value
     *     allowed object is
     *     {@link QrcType }
     *     
     */
    public void setQrcType(QrcType value) {
        this.qrcType = value;
    }

}
