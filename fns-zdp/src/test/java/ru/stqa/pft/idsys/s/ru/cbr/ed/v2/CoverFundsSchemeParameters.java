
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Condition Parameters.
 * 
 * <p>Java class for CoverFundsSchemeParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoverFundsSchemeParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoverSum" type="{urn:cbr-ru:ed:v2.0}CoverSum" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ParticipantToBeNotified" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoverFundsSchemeParameters", propOrder = {
    "coverSum"
})
public class CoverFundsSchemeParameters {

    @XmlElement(name = "CoverSum")
    protected CoverSum coverSum;
    @XmlAttribute(name = "ParticipantToBeNotified")
    protected String participantToBeNotified;

    /**
     * Gets the value of the coverSum property.
     * 
     * @return
     *     possible object is
     *     {@link CoverSum }
     *     
     */
    public CoverSum getCoverSum() {
        return coverSum;
    }

    /**
     * Sets the value of the coverSum property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoverSum }
     *     
     */
    public void setCoverSum(CoverSum value) {
        this.coverSum = value;
    }

    /**
     * Gets the value of the participantToBeNotified property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipantToBeNotified() {
        return participantToBeNotified;
    }

    /**
     * Sets the value of the participantToBeNotified property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipantToBeNotified(String value) {
        this.participantToBeNotified = value;
    }

}
