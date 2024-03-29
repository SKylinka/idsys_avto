
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.ChangeType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.EventCodeType;


/**
 * Event.
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="EventCode" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EventCodeType" />
 *       &lt;attribute name="EventNumber" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *       &lt;attribute name="EventFrequency" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max4NumberType" />
 *       &lt;attribute name="EventTime" type="{urn:cbr-ru:ed:leaftypes:v2.0}TimeType" />
 *       &lt;attribute name="EventMinimumDuration" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max3NumberType" />
 *       &lt;attribute name="ChangeType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}ChangeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType")
public class EventType {

    @XmlAttribute(name = "EventCode", required = true)
    protected EventCodeType eventCode;
    @XmlAttribute(name = "EventNumber")
    protected String eventNumber;
    @XmlAttribute(name = "EventFrequency")
    protected BigInteger eventFrequency;
    @XmlAttribute(name = "EventTime")
    protected XMLGregorianCalendar eventTime;
    @XmlAttribute(name = "EventMinimumDuration")
    protected BigInteger eventMinimumDuration;
    @XmlAttribute(name = "ChangeType", required = true)
    protected ChangeType changeType;

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
     *     {@link String }
     *     
     */
    public String getEventNumber() {
        return eventNumber;
    }

    /**
     * Sets the value of the eventNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventNumber(String value) {
        this.eventNumber = value;
    }

    /**
     * Gets the value of the eventFrequency property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventFrequency() {
        return eventFrequency;
    }

    /**
     * Sets the value of the eventFrequency property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventFrequency(BigInteger value) {
        this.eventFrequency = value;
    }

    /**
     * Gets the value of the eventTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventTime() {
        return eventTime;
    }

    /**
     * Sets the value of the eventTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventTime(XMLGregorianCalendar value) {
        this.eventTime = value;
    }

    /**
     * Gets the value of the eventMinimumDuration property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEventMinimumDuration() {
        return eventMinimumDuration;
    }

    /**
     * Sets the value of the eventMinimumDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEventMinimumDuration(BigInteger value) {
        this.eventMinimumDuration = value;
    }

    /**
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeType }
     *     
     */
    public ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeType }
     *     
     */
    public void setChangeType(ChangeType value) {
        this.changeType = value;
    }

}
