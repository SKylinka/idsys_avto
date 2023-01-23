
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * SWIFT BICs.
 * 
 * <p>Java class for SWBICsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWBICsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SWBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICSWIFTIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWBICsList")
public class SWBICsList {

    @XmlAttribute(name = "SWBIC", required = true)
    protected String swbic;

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

}
