
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.EventCodeType;


/**
 * Event of Balance Sweeping.
 * 
 * <p>Java class for EventTransfer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventTransfer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EventCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EventCodeType" />
 *       &lt;attribute name="EventNumber" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max3NumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventTransfer")
public class EventTransfer {

    @XmlAttribute(name = "EventCode", required = true)
    protected EventCodeType eventCode;
    @XmlAttribute(name = "EventNumber")
    protected BigInteger eventNumber;

    /**
     * Gets the value of the eventCode property.
     * 
     * @return
     *     possible object is
     *     {@link EventCodeType }
     *     
     */
    public EventCodeType getEventCode() {
        return eventCode;
    }

    /**
     * Sets the value of the eventCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventCodeType }
     *     
     */
    public void setEventCode(EventCodeType value) {
        this.eventCode = value;
    }

    /**
     * Gets the value of the eventNumber property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventNumber() {
        return eventNumber;
    }

    /**
     * Sets the value of the eventNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventNumber(BigInteger value) {
        this.eventNumber = value;
    }

}
