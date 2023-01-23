
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о лице.
 * 
 * <p>Java class for OfficialPersonInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfficialPersonInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="HoldPosition" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max150TextType" />
 *       &lt;attribute name="Name" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max60TextType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfficialPersonInfo")
public class OfficialPersonInfo {

    @XmlAttribute(name = "HoldPosition", required = true)
    protected String holdPosition;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the holdPosition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldPosition() {
        return holdPosition;
    }

    /**
     * Sets the value of the holdPosition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldPosition(String value) {
        this.holdPosition = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
