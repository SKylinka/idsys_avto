
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Condition Parameters.
 * 
 * <p>Java class for RCPSchemeParameters complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RCPSchemeParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BeginProcessingDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="EndProcessingDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="ClearingCircuit" type="{urn:cbr-ru:ed:leaftypes:v2.0}ClearingCircuitType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RCPSchemeParameters")
public class RCPSchemeParameters {

    @XmlAttribute(name = "BeginProcessingDate", required = true)
    protected XMLGregorianCalendar beginProcessingDate;
    @XmlAttribute(name = "EndProcessingDate", required = true)
    protected XMLGregorianCalendar endProcessingDate;
    @XmlAttribute(name = "ClearingCircuit")
    protected String clearingCircuit;

    /**
     * Gets the value of the beginProcessingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBeginProcessingDate() {
        return beginProcessingDate;
    }

    /**
     * Sets the value of the beginProcessingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBeginProcessingDate(XMLGregorianCalendar value) {
        this.beginProcessingDate = value;
    }

    /**
     * Gets the value of the endProcessingDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndProcessingDate() {
        return endProcessingDate;
    }

    /**
     * Sets the value of the endProcessingDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndProcessingDate(XMLGregorianCalendar value) {
        this.endProcessingDate = value;
    }

    /**
     * Gets the value of the clearingCircuit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClearingCircuit() {
        return clearingCircuit;
    }

    /**
     * Sets the value of the clearingCircuit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClearingCircuit(String value) {
        this.clearingCircuit = value;
    }

}
