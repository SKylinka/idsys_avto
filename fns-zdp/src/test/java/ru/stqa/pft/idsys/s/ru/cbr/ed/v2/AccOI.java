
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация по ответисполнителям
 * 
 * <p>Java class for AccOI complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccOI">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BICOI" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="OINo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}UserIDType" />
 *       &lt;attribute name="OISurname" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max50TextType" />
 *       &lt;attribute name="OIName" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max50TextType" />
 *       &lt;attribute name="OIPatronymic" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max50TextType" />
 *       &lt;attribute name="AccessType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccOI")
public class AccOI {

    @XmlAttribute(name = "BICOI", required = true)
    protected String bicoi;
    @XmlAttribute(name = "OINo", required = true)
    protected String oiNo;
    @XmlAttribute(name = "OISurname", required = true)
    protected String oiSurname;
    @XmlAttribute(name = "OIName", required = true)
    protected String oiName;
    @XmlAttribute(name = "OIPatronymic")
    protected String oiPatronymic;
    @XmlAttribute(name = "AccessType", required = true)
    protected String accessType;

    /**
     * Gets the value of the bicoi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBICOI() {
        return bicoi;
    }

    /**
     * Sets the value of the bicoi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBICOI(String value) {
        this.bicoi = value;
    }

    /**
     * Gets the value of the oiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOINo() {
        return oiNo;
    }

    /**
     * Sets the value of the oiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOINo(String value) {
        this.oiNo = value;
    }

    /**
     * Gets the value of the oiSurname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOISurname() {
        return oiSurname;
    }

    /**
     * Sets the value of the oiSurname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOISurname(String value) {
        this.oiSurname = value;
    }

    /**
     * Gets the value of the oiName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIName() {
        return oiName;
    }

    /**
     * Sets the value of the oiName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIName(String value) {
        this.oiName = value;
    }

    /**
     * Gets the value of the oiPatronymic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOIPatronymic() {
        return oiPatronymic;
    }

    /**
     * Sets the value of the oiPatronymic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOIPatronymic(String value) {
        this.oiPatronymic = value;
    }

    /**
     * Gets the value of the accessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessType() {
        return accessType;
    }

    /**
     * Sets the value of the accessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessType(String value) {
        this.accessType = value;
    }

}
