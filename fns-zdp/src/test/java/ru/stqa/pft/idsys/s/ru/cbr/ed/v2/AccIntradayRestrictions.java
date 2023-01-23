
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Intraday restrictions on an account.
 * 
 * <p>Java class for AccIntradayRestrictions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccIntradayRestrictions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StopSendFTI" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="StopCredits" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="StopUrgentFTS" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="SuspendSendRecvEM" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="StopDebits" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="StopFPS" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="LiquidAccumulate" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="PendingDeletion" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="RouteToCBR" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="ManualVerifMode" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="Arrest" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *         &lt;element name="SpecialMode" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccIntradayRestrictions", propOrder = {
    "stopSendFTI",
    "stopCredits",
    "stopUrgentFTS",
    "suspendSendRecvEM",
    "stopDebits",
    "stopFPS",
    "liquidAccumulate",
    "pendingDeletion",
    "routeToCBR",
    "manualVerifMode",
    "arrest",
    "specialMode"
})
public class AccIntradayRestrictions {

    @XmlElement(name = "StopSendFTI")
    protected IntradayRestrictionsType stopSendFTI;
    @XmlElement(name = "StopCredits")
    protected IntradayRestrictionsType stopCredits;
    @XmlElement(name = "StopUrgentFTS")
    protected IntradayRestrictionsType stopUrgentFTS;
    @XmlElement(name = "SuspendSendRecvEM")
    protected IntradayRestrictionsType suspendSendRecvEM;
    @XmlElement(name = "StopDebits")
    protected IntradayRestrictionsType stopDebits;
    @XmlElement(name = "StopFPS")
    protected IntradayRestrictionsType stopFPS;
    @XmlElement(name = "LiquidAccumulate")
    protected IntradayRestrictionsType liquidAccumulate;
    @XmlElement(name = "PendingDeletion")
    protected IntradayRestrictionsType pendingDeletion;
    @XmlElement(name = "RouteToCBR")
    protected IntradayRestrictionsType routeToCBR;
    @XmlElement(name = "ManualVerifMode")
    protected IntradayRestrictionsType manualVerifMode;
    @XmlElement(name = "Arrest")
    protected IntradayRestrictionsType arrest;
    @XmlElement(name = "SpecialMode")
    protected IntradayRestrictionsType specialMode;

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
     * Gets the value of the stopCredits property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getStopCredits() {
        return stopCredits;
    }

    /**
     * Sets the value of the stopCredits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setStopCredits(IntradayRestrictionsType value) {
        this.stopCredits = value;
    }

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
     * Gets the value of the suspendSendRecvEM property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getSuspendSendRecvEM() {
        return suspendSendRecvEM;
    }

    /**
     * Sets the value of the suspendSendRecvEM property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setSuspendSendRecvEM(IntradayRestrictionsType value) {
        this.suspendSendRecvEM = value;
    }

    /**
     * Gets the value of the stopDebits property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getStopDebits() {
        return stopDebits;
    }

    /**
     * Sets the value of the stopDebits property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setStopDebits(IntradayRestrictionsType value) {
        this.stopDebits = value;
    }

    /**
     * Gets the value of the stopFPS property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getStopFPS() {
        return stopFPS;
    }

    /**
     * Sets the value of the stopFPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setStopFPS(IntradayRestrictionsType value) {
        this.stopFPS = value;
    }

    /**
     * Gets the value of the liquidAccumulate property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getLiquidAccumulate() {
        return liquidAccumulate;
    }

    /**
     * Sets the value of the liquidAccumulate property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setLiquidAccumulate(IntradayRestrictionsType value) {
        this.liquidAccumulate = value;
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

    /**
     * Gets the value of the routeToCBR property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getRouteToCBR() {
        return routeToCBR;
    }

    /**
     * Sets the value of the routeToCBR property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setRouteToCBR(IntradayRestrictionsType value) {
        this.routeToCBR = value;
    }

    /**
     * Gets the value of the manualVerifMode property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getManualVerifMode() {
        return manualVerifMode;
    }

    /**
     * Sets the value of the manualVerifMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setManualVerifMode(IntradayRestrictionsType value) {
        this.manualVerifMode = value;
    }

    /**
     * Gets the value of the arrest property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getArrest() {
        return arrest;
    }

    /**
     * Sets the value of the arrest property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setArrest(IntradayRestrictionsType value) {
        this.arrest = value;
    }

    /**
     * Gets the value of the specialMode property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public IntradayRestrictionsType getSpecialMode() {
        return specialMode;
    }

    /**
     * Sets the value of the specialMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictionsType }
     *     
     */
    public void setSpecialMode(IntradayRestrictionsType value) {
        this.specialMode = value;
    }

}