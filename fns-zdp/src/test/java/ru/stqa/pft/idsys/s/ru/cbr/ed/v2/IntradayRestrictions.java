
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Intraday Restrictions applied to Participants.
 * 
 * <p>Java class for IntradayRestrictions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntradayRestrictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopUrgentFTS" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="StopSendFTI" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="StopSendRecvEM" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="CreditorsRequirementsMoratorium" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="PendingDeletion" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntradayRestrictions", propOrder = {
    "stopUrgentFTS",
    "stopSendFTI",
    "stopSendRecvEM",
    "creditorsRequirementsMoratorium",
    "pendingDeletion"
})
public class IntradayRestrictions {

    @XmlElement(name = "StopUrgentFTS")
    protected IntradayRestrictionsType stopUrgentFTS;
    @XmlElement(name = "StopSendFTI")
    protected IntradayRestrictionsType stopSendFTI;
    @XmlElement(name = "StopSendRecvEM")
    protected IntradayRestrictionsType stopSendRecvEM;
    @XmlElement(name = "CreditorsRequirementsMoratorium")
    protected IntradayRestrictionsType creditorsRequirementsMoratorium;
    @XmlElement(name = "PendingDeletion")
    protected IntradayRestrictionsType pendingDeletion;

    /**
     * Gets the value of the stopUrgentFTS property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getStopUrgentFTS() {
        return stopUrgentFTS;
    }

    /**
     * Sets the value of the stopUrgentFTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setStopUrgentFTS(IntradayRestrictionsType value) {
        this.stopUrgentFTS = value;
    }

    /**
     * Gets the value of the stopSendFTI property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getStopSendFTI() {
        return stopSendFTI;
    }

    /**
     * Sets the value of the stopSendFTI property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setStopSendFTI(IntradayRestrictionsType value) {
        this.stopSendFTI = value;
    }

    /**
     * Gets the value of the stopSendRecvEM property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getStopSendRecvEM() {
        return stopSendRecvEM;
    }

    /**
     * Sets the value of the stopSendRecvEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setStopSendRecvEM(IntradayRestrictionsType value) {
        this.stopSendRecvEM = value;
    }

    /**
     * Gets the value of the creditorsRequirementsMoratorium property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getCreditorsRequirementsMoratorium() {
        return creditorsRequirementsMoratorium;
    }

    /**
     * Sets the value of the creditorsRequirementsMoratorium property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setCreditorsRequirementsMoratorium(IntradayRestrictionsType value) {
        this.creditorsRequirementsMoratorium = value;
    }

    /**
     * Gets the value of the pendingDeletion property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getPendingDeletion() {
        return pendingDeletion;
    }

    /**
     * Sets the value of the pendingDeletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setPendingDeletion(IntradayRestrictionsType value) {
        this.pendingDeletion = value;
    }

}
