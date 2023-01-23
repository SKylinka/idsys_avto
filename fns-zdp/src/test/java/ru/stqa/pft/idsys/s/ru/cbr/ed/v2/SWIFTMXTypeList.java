
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Список типов сообщений SWIFT MX
 * 
 * <p>Java class for SWIFTMXTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIFTMXTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SWIFTMXTypeNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max15TextType" fixed="999999999999999" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIFTMXTypeList")
public class SWIFTMXTypeList {

    @XmlAttribute(name = "SWIFTMXTypeNo", required = true)
    protected String swiftmxTypeNo;

    /**
     * Gets the value of the swiftmxTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTMXTypeNo() {
        if (swiftmxTypeNo == null) {
            return "999999999999999";
        } else {
            return swiftmxTypeNo;
        }
    }

    /**
     * Sets the value of the swiftmxTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTMXTypeNo(String value) {
        this.swiftmxTypeNo = value;
    }

}
