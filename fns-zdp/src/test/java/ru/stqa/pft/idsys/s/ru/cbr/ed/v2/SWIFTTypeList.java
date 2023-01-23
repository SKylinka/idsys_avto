
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Список типов сообщений SWIFT MT
 * 
 * <p>Java class for SWIFTTypeList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SWIFTTypeList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="SWIFTTypeNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max5TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SWIFTTypeList")
public class SWIFTTypeList {

    @XmlAttribute(name = "SWIFTTypeNo", required = true)
    protected String swiftTypeNo;

    /**
     * Gets the value of the swiftTypeNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSWIFTTypeNo() {
        return swiftTypeNo;
    }

    /**
     * Sets the value of the swiftTypeNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSWIFTTypeNo(String value) {
        this.swiftTypeNo = value;
    }

}
