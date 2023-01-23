
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * SWIFT BICs of Participant.
 * 
 * <p>Java class for SWBICList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWBICList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SWBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICSWIFTIDType" />
 *       &lt;attribute name="DefaultSWBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWBICList")
public class SWBICList {

    @XmlAttribute(name = "SWBIC", required = true)
    protected String swbic;
    @XmlAttribute(name = "DefaultSWBIC", required = true)
    protected boolean defaultSWBIC;

    /**
     * Gets the value of the swbic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWBIC() {
        return swbic;
    }

    /**
     * Sets the value of the swbic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWBIC(String value) {
        this.swbic = value;
    }

    /**
     * Gets the value of the defaultSWBIC property.
     * 
     */
    public boolean isDefaultSWBIC() {
        return defaultSWBIC;
    }

    /**
     * Sets the value of the defaultSWBIC property.
     * 
     */
    public void setDefaultSWBIC(boolean value) {
        this.defaultSWBIC = value;
    }

}
