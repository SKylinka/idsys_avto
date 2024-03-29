
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of BICs of Banks using Authorized Sender.
 * 
 * <p>Java class for CFBICList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CFBICList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CFBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CFBICList", propOrder = {
    "cfbic"
})
public class CFBICList {

    @XmlElement(name = "CFBIC", required = true)
    protected List<String> cfbic;

    /**
     * Gets the value of the cfbic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cfbic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCFBIC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCFBIC() {
        if (cfbic == null) {
            cfbic = new ArrayList<String>();
        }
        return this.cfbic;
    }

}
