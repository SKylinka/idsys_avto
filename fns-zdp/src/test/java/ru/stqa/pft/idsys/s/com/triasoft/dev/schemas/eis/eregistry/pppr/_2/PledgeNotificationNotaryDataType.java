
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Данные нотариуса для уведомления
 * 
 * <p>Java class for PledgeNotificationNotaryDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PledgeNotificationNotaryDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DistrictName" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="NotaryName" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="NotaryID" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String8Type"/>
 *         &lt;element name="SignerID" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String8Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeNotificationNotaryDataType", propOrder = {
    "districtName",
    "notaryName",
    "notaryID",
    "signerID"
})
public class PledgeNotificationNotaryDataType {

    @XmlElement(name = "DistrictName", required = true)
    protected String districtName;
    @XmlElement(name = "NotaryName", required = true)
    protected String notaryName;
    @XmlElement(name = "NotaryID", required = true)
    protected String notaryID;
    @XmlElement(name = "SignerID", required = true)
    protected String signerID;

    /**
     * Gets the value of the districtName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Sets the value of the districtName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Gets the value of the notaryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryName() {
        return notaryName;
    }

    /**
     * Sets the value of the notaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryName(String value) {
        this.notaryName = value;
    }

    /**
     * Gets the value of the notaryID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotaryID() {
        return notaryID;
    }

    /**
     * Sets the value of the notaryID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotaryID(String value) {
        this.notaryID = value;
    }

    /**
     * Gets the value of the signerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignerID() {
        return signerID;
    }

    /**
     * Sets the value of the signerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignerID(String value) {
        this.signerID = value;
    }

}
