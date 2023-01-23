
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.BusinessScenarioType;


/**
 * System-defined Business Scenario Identifier.
 * 
 * <p>Java class for ProcessingDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProcessingDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Session" type="{urn:cbr-ru:ed:v2.0}Session" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BusinessScenario" type="{urn:cbr-ru:ed:leaftypes:v2.0}BusinessScenarioType" />
 *       &lt;attribute name="DebitDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="CreditDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProcessingDetails", propOrder = {
    "session"
})
public class ProcessingDetails {

    @XmlElement(name = "Session")
    protected Session session;
    @XmlAttribute(name = "BusinessScenario")
    protected BusinessScenarioType businessScenario;
    @XmlAttribute(name = "DebitDate")
    protected XMLGregorianCalendar debitDate;
    @XmlAttribute(name = "CreditDate")
    protected XMLGregorianCalendar creditDate;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link Session }
     *     
     */
    public Session getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link Session }
     *     
     */
    public void setSession(Session value) {
        this.session = value;
    }

    /**
     * Gets the value of the businessScenario property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessScenarioType }
     *     
     */
    public BusinessScenarioType getBusinessScenario() {
        return businessScenario;
    }

    /**
     * Sets the value of the businessScenario property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessScenarioType }
     *     
     */
    public void setBusinessScenario(BusinessScenarioType value) {
        this.businessScenario = value;
    }

    /**
     * Gets the value of the debitDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDebitDate() {
        return debitDate;
    }

    /**
     * Sets the value of the debitDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDebitDate(XMLGregorianCalendar value) {
        this.debitDate = value;
    }

    /**
     * Gets the value of the creditDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreditDate() {
        return creditDate;
    }

    /**
     * Sets the value of the creditDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreditDate(XMLGregorianCalendar value) {
        this.creditDate = value;
    }

}
