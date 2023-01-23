
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Restriction of service.
 * 
 * <p>Java class for IntradayRestrictionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IntradayRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RestrictionBasisDoc" type="{urn:cbr-ru:ed:v2.0}RestrictionBasisDocument" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Applied" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="ApplyDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntradayRestrictionsType", propOrder = {
    "restrictionBasisDoc"
})
public class IntradayRestrictionsType {

    @XmlElement(name = "RestrictionBasisDoc")
    protected RestrictionBasisDocument restrictionBasisDoc;
    @XmlAttribute(name = "Applied", required = true)
    protected boolean applied;
    @XmlAttribute(name = "ApplyDate")
    protected XMLGregorianCalendar applyDate;

    /**
     * Gets the value of the restrictionBasisDoc property.
     * 
     * @return
     *     possible object is
     *     {@link RestrictionBasisDocument }
     *     
     */
    public RestrictionBasisDocument getRestrictionBasisDoc() {
        return restrictionBasisDoc;
    }

    /**
     * Sets the value of the restrictionBasisDoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link RestrictionBasisDocument }
     *     
     */
    public void setRestrictionBasisDoc(RestrictionBasisDocument value) {
        this.restrictionBasisDoc = value;
    }

    /**
     * Gets the value of the applied property.
     * 
     */
    public boolean isApplied() {
        return applied;
    }

    /**
     * Sets the value of the applied property.
     * 
     */
    public void setApplied(boolean value) {
        this.applied = value;
    }

    /**
     * Gets the value of the applyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApplyDate() {
        return applyDate;
    }

    /**
     * Sets the value of the applyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApplyDate(XMLGregorianCalendar value) {
        this.applyDate = value;
    }

}
