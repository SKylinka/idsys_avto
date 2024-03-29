
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * EPS Attributes.
 * 
 * <p>Java class for EPSInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EPSInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClearingCircuits" type="{urn:cbr-ru:ed:v2.0}ClearingCircuits" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RCPAllowed" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EPSInfo", propOrder = {
    "clearingCircuits"
})
public class EPSInfo {

    @XmlElement(name = "ClearingCircuits", required = true)
    protected List<ClearingCircuits> clearingCircuits;
    @XmlAttribute(name = "RCPAllowed", required = true)
    protected boolean rcpAllowed;

    /**
     * Gets the value of the clearingCircuits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clearingCircuits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClearingCircuits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClearingCircuits }
     * 
     * 
     */
    public List<ClearingCircuits> getClearingCircuits() {
        if (clearingCircuits == null) {
            clearingCircuits = new ArrayList<ClearingCircuits>();
        }
        return this.clearingCircuits;
    }

    /**
     * Gets the value of the rcpAllowed property.
     * 
     */
    public boolean isRCPAllowed() {
        return rcpAllowed;
    }

    /**
     * Sets the value of the rcpAllowed property.
     * 
     */
    public void setRCPAllowed(boolean value) {
        this.rcpAllowed = value;
    }

}
