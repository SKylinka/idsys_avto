
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Legacy systems information.
 * 
 * <p>Java class for LegacySystemsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegacySystemsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UFCFMD" type="{urn:cbr-ru:ed:v2.0}UFCFMD" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegacySystemsInfoType", propOrder = {
    "ufcfmd"
})
public class LegacySystemsInfoType {

    @XmlElement(name = "UFCFMD")
    protected UFCFMD ufcfmd;

    /**
     * Gets the value of the ufcfmd property.
     * 
     * @return
     *     possible object is
     *     {@link UFCFMD }
     *     
     */
    public UFCFMD getUFCFMD() {
        return ufcfmd;
    }

    /**
     * Sets the value of the ufcfmd property.
     * 
     * @param value
     *     allowed object is
     *     {@link UFCFMD }
     *     
     */
    public void setUFCFMD(UFCFMD value) {
        this.ufcfmd = value;
    }

}
