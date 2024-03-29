
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Participantís Attributes.
 * 
 * <p>Java class for ParticipantAttributes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantAttributes">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CanBeAuthorOfConfLiqRsrv" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="CanBeAuthorOfLiqRsrv" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="CanBeAuthorOfCover" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="CanSendDD" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="CanBeAuthorReqOfRsrv" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantAttributes")
public class ParticipantAttributes {

    @XmlAttribute(name = "CanBeAuthorOfConfLiqRsrv", required = true)
    protected boolean canBeAuthorOfConfLiqRsrv;
    @XmlAttribute(name = "CanBeAuthorOfLiqRsrv", required = true)
    protected boolean canBeAuthorOfLiqRsrv;
    @XmlAttribute(name = "CanBeAuthorOfCover", required = true)
    protected boolean canBeAuthorOfCover;
    @XmlAttribute(name = "CanSendDD")
    protected Boolean canSendDD;
    @XmlAttribute(name = "CanBeAuthorReqOfRsrv")
    protected Boolean canBeAuthorReqOfRsrv;

    /**
     * Gets the value of the canBeAuthorOfConfLiqRsrv property.
     * 
     */
    public boolean isCanBeAuthorOfConfLiqRsrv() {
        return canBeAuthorOfConfLiqRsrv;
    }

    /**
     * Sets the value of the canBeAuthorOfConfLiqRsrv property.
     * 
     */
    public void setCanBeAuthorOfConfLiqRsrv(boolean value) {
        this.canBeAuthorOfConfLiqRsrv = value;
    }

    /**
     * Gets the value of the canBeAuthorOfLiqRsrv property.
     * 
     */
    public boolean isCanBeAuthorOfLiqRsrv() {
        return canBeAuthorOfLiqRsrv;
    }

    /**
     * Sets the value of the canBeAuthorOfLiqRsrv property.
     * 
     */
    public void setCanBeAuthorOfLiqRsrv(boolean value) {
        this.canBeAuthorOfLiqRsrv = value;
    }

    /**
     * Gets the value of the canBeAuthorOfCover property.
     * 
     */
    public boolean isCanBeAuthorOfCover() {
        return canBeAuthorOfCover;
    }

    /**
     * Sets the value of the canBeAuthorOfCover property.
     * 
     */
    public void setCanBeAuthorOfCover(boolean value) {
        this.canBeAuthorOfCover = value;
    }

    /**
     * Gets the value of the canSendDD property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanSendDD() {
        return canSendDD;
    }

    /**
     * Sets the value of the canSendDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanSendDD(Boolean value) {
        this.canSendDD = value;
    }

    /**
     * Gets the value of the canBeAuthorReqOfRsrv property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCanBeAuthorReqOfRsrv() {
        return canBeAuthorReqOfRsrv;
    }

    /**
     * Sets the value of the canBeAuthorReqOfRsrv property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCanBeAuthorReqOfRsrv(Boolean value) {
        this.canBeAuthorReqOfRsrv = value;
    }

}
