
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о состоянии ИЛС
 * 
 * <p>Java class for SBP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SBP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="UL_Register" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}UL_Register"/>
 *         &lt;element name="Acc_Register" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Acc_Register"/>
 *         &lt;element name="TSP_Register" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}TSP_Register"/>
 *         &lt;element name="QR_Register" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}QR_Register"/>
 *         &lt;element name="QR_Payload" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}QR_Payload"/>
 *         &lt;element name="QR_Status" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}QR_Status"/>
 *         &lt;element name="QR_Data" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}QR_Data"/>
 *         &lt;element name="TSP_Info" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}TSP_Info"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SBP", propOrder = {
    "ulRegister",
    "accRegister",
    "tspRegister",
    "qrRegister",
    "qrPayload",
    "qrStatus",
    "qrData",
    "tspInfo"
})
public class SBP {

    @XmlElement(name = "UL_Register")
    protected ULRegister ulRegister;
    @XmlElement(name = "Acc_Register")
    protected AccRegister accRegister;
    @XmlElement(name = "TSP_Register")
    protected TSPRegister tspRegister;
    @XmlElement(name = "QR_Register")
    protected QRRegister qrRegister;
    @XmlElement(name = "QR_Payload")
    protected QRPayload qrPayload;
    @XmlElement(name = "QR_Status")
    protected QRStatus qrStatus;
    @XmlElement(name = "QR_Data")
    protected QRData qrData;
    @XmlElement(name = "TSP_Info")
    protected TSPInfo tspInfo;

    /**
     * Gets the value of the ulRegister property.
     * 
     * @return
     *     possible object is
     *     {@link ULRegister }
     *     
     */
    public ULRegister getULRegister() {
        return ulRegister;
    }

    /**
     * Sets the value of the ulRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link ULRegister }
     *     
     */
    public void setULRegister(ULRegister value) {
        this.ulRegister = value;
    }

    /**
     * Gets the value of the accRegister property.
     * 
     * @return
     *     possible object is
     *     {@link AccRegister }
     *     
     */
    public AccRegister getAccRegister() {
        return accRegister;
    }

    /**
     * Sets the value of the accRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccRegister }
     *     
     */
    public void setAccRegister(AccRegister value) {
        this.accRegister = value;
    }

    /**
     * Gets the value of the tspRegister property.
     * 
     * @return
     *     possible object is
     *     {@link TSPRegister }
     *     
     */
    public TSPRegister getTSPRegister() {
        return tspRegister;
    }

    /**
     * Sets the value of the tspRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPRegister }
     *     
     */
    public void setTSPRegister(TSPRegister value) {
        this.tspRegister = value;
    }

    /**
     * Gets the value of the qrRegister property.
     * 
     * @return
     *     possible object is
     *     {@link QRRegister }
     *     
     */
    public QRRegister getQRRegister() {
        return qrRegister;
    }

    /**
     * Sets the value of the qrRegister property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRRegister }
     *     
     */
    public void setQRRegister(QRRegister value) {
        this.qrRegister = value;
    }

    /**
     * Gets the value of the qrPayload property.
     * 
     * @return
     *     possible object is
     *     {@link QRPayload }
     *     
     */
    public QRPayload getQRPayload() {
        return qrPayload;
    }

    /**
     * Sets the value of the qrPayload property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRPayload }
     *     
     */
    public void setQRPayload(QRPayload value) {
        this.qrPayload = value;
    }

    /**
     * Gets the value of the qrStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QRStatus }
     *     
     */
    public QRStatus getQRStatus() {
        return qrStatus;
    }

    /**
     * Sets the value of the qrStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRStatus }
     *     
     */
    public void setQRStatus(QRStatus value) {
        this.qrStatus = value;
    }

    /**
     * Gets the value of the qrData property.
     * 
     * @return
     *     possible object is
     *     {@link QRData }
     *     
     */
    public QRData getQRData() {
        return qrData;
    }

    /**
     * Sets the value of the qrData property.
     * 
     * @param value
     *     allowed object is
     *     {@link QRData }
     *     
     */
    public void setQRData(QRData value) {
        this.qrData = value;
    }

    /**
     * Gets the value of the tspInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TSPInfo }
     *     
     */
    public TSPInfo getTSPInfo() {
        return tspInfo;
    }

    /**
     * Sets the value of the tspInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSPInfo }
     *     
     */
    public void setTSPInfo(TSPInfo value) {
        this.tspInfo = value;
    }

}
