
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.SessionTypeType;


/**
 * Settlement Cycle Type and Number (Or Settlement Time).
 * 
 * <p>Java class for Session complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Session">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="SessionID" type="{urn:cbr-ru:ed:leaftypes:v2.0}SessionIDType"/>
 *         &lt;element name="SettlementTime" type="{urn:cbr-ru:ed:leaftypes:v2.0}TimeType"/>
 *       &lt;/choice>
 *       &lt;attribute name="SessionType" type="{urn:cbr-ru:ed:leaftypes:v2.0}SessionTypeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Session", propOrder = {
    "sessionID",
    "settlementTime"
})
public class Session {

    @XmlElement(name = "SessionID")
    protected String sessionID;
    @XmlElement(name = "SettlementTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar settlementTime;
    @XmlAttribute(name = "SessionType")
    protected SessionTypeType sessionType;

    /**
     * Gets the value of the sessionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionID() {
        return sessionID;
    }

    /**
     * Sets the value of the sessionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionID(String value) {
        this.sessionID = value;
    }

    /**
     * Gets the value of the settlementTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSettlementTime() {
        return settlementTime;
    }

    /**
     * Sets the value of the settlementTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSettlementTime(XMLGregorianCalendar value) {
        this.settlementTime = value;
    }

    /**
     * Gets the value of the sessionType property.
     * 
     * @return
     *     possible object is
     *     {@link SessionTypeType }
     *     
     */
    public SessionTypeType getSessionType() {
        return sessionType;
    }

    /**
     * Sets the value of the sessionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SessionTypeType }
     *     
     */
    public void setSessionType(SessionTypeType value) {
        this.sessionType = value;
    }

}
