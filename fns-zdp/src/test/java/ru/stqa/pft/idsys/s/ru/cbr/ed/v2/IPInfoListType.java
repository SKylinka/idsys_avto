
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indirect Participant Info.
 * 
 * <p>Java class for IPInfoListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPInfoListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IPBICAccList" type="{urn:cbr-ru:ed:v2.0}IPBICAccListType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPInfoListType", propOrder = {
    "ipbicAccList"
})
public class IPInfoListType {

    @XmlElement(name = "IPBICAccList", required = true)
    protected List<IPBICAccListType> ipbicAccList;

    /**
     * Gets the value of the ipbicAccList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ipbicAccList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIPBICAccList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IPBICAccListType }
     * 
     * 
     */
    public List<IPBICAccListType> getIPBICAccList() {
        if (ipbicAccList == null) {
            ipbicAccList = new ArrayList<IPBICAccListType>();
        }
        return this.ipbicAccList;
    }

}
