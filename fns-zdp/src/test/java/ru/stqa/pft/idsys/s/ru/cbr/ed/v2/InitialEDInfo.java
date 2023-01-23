
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о транзакционном пакете ЭС
 * 
 * <p>Java class for InitialEDInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InitialEDInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EDRefID" type="{urn:cbr-ru:ed:v2.0}EDRefID"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PacketStatus" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InitialEDInfo", propOrder = {
    "edRefID"
})
public class InitialEDInfo {

    @XmlElement(name = "EDRefID", required = true)
    protected EDRefID edRefID;
    @XmlAttribute(name = "PacketStatus")
    protected String packetStatus;

    /**
     * Gets the value of the edRefID property.
     * 
     * @return
     *     possible object is
     *     {@link EDRefID }
     *     
     */
    public EDRefID getEDRefID() {
        return edRefID;
    }

    /**
     * Sets the value of the edRefID property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDRefID }
     *     
     */
    public void setEDRefID(EDRefID value) {
        this.edRefID = value;
    }

    /**
     * Gets the value of the packetStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPacketStatus() {
        return packetStatus;
    }

    /**
     * Sets the value of the packetStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPacketStatus(String value) {
        this.packetStatus = value;
    }

}
