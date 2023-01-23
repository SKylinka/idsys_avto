
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Value and Usage of Limits.
 * 
 * <p>Java class for LimitsInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LimitsInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LimitInfo" type="{urn:cbr-ru:ed:v2.0}LimitInfoType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LimitsInfo", propOrder = {
    "limitInfo"
})
public class LimitsInfo {

    @XmlElement(name = "LimitInfo", required = true)
    protected List<LimitInfoType> limitInfo;

    /**
     * Gets the value of the limitInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the limitInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLimitInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LimitInfoType }
     * 
     * 
     */
    public List<LimitInfoType> getLimitInfo() {
        if (limitInfo == null) {
            limitInfo = new ArrayList<LimitInfoType>();
        }
        return this.limitInfo;
    }

}
