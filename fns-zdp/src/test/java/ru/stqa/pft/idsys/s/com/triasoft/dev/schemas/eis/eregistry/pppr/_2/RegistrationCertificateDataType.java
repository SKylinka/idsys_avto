
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Тип Основные данные свидетельства о регистрации уведомления 2.0
 * 
 * <p>Java class for RegistrationCertificateDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegistrationCertificateDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NotificationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}NotificationReferenceNumberType" minOccurs="0"/>
 *         &lt;element name="RegistrationTime" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}DateTimeType" minOccurs="0"/>
 *         &lt;element name="NotificationData" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationDataType"/>
 *         &lt;element name="RejectReason" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-4000Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistrationCertificateDataType", propOrder = {
    "notificationReferenceNumber",
    "registrationTime",
    "notificationData",
    "rejectReason"
})
public class RegistrationCertificateDataType {

    @XmlElement(name = "NotificationReferenceNumber")
    protected String notificationReferenceNumber;
    @XmlElement(name = "RegistrationTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar registrationTime;
    @XmlElement(name = "NotificationData", required = true)
    protected PledgeNotificationDataType notificationData;
    @XmlElement(name = "RejectReason")
    protected String rejectReason;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the notificationReferenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNotificationReferenceNumber() {
        return notificationReferenceNumber;
    }

    /**
     * Sets the value of the notificationReferenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNotificationReferenceNumber(String value) {
        this.notificationReferenceNumber = value;
    }

    /**
     * Gets the value of the registrationTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegistrationTime() {
        return registrationTime;
    }

    /**
     * Sets the value of the registrationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegistrationTime(XMLGregorianCalendar value) {
        this.registrationTime = value;
    }

    /**
     * Gets the value of the notificationData property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType }
     *     
     */
    public PledgeNotificationDataType getNotificationData() {
        return notificationData;
    }

    /**
     * Sets the value of the notificationData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType }
     *     
     */
    public void setNotificationData(PledgeNotificationDataType value) {
        this.notificationData = value;
    }

    /**
     * Gets the value of the rejectReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * Sets the value of the rejectReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectReason(String value) {
        this.rejectReason = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
