
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Arrests/Limitations Info.
 * 
 * <p>Java class for ArrestsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrestsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ArrestDetailedInfo" type="{urn:cbr-ru:ed:v2.0}ArrestDetailedInfo" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrestsInfo", propOrder = {
    "arrestDetailedInfo"
})
public class ArrestsInfo {

    @XmlElement(name = "ArrestDetailedInfo", required = true)
    protected List<ArrestDetailedInfo> arrestDetailedInfo;

    /**
     * Gets the value of the arrestDetailedInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the arrestDetailedInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArrestDetailedInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrestDetailedInfo }
     * 
     * 
     */
    public List<ArrestDetailedInfo> getArrestDetailedInfo() {
        if (arrestDetailedInfo == null) {
            arrestDetailedInfo = new ArrayList<ArrestDetailedInfo>();
        }
        return this.arrestDetailedInfo;
    }

}
