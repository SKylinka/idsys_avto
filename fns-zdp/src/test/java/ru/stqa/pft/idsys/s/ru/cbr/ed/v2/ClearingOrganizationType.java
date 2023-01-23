
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Признак совмещения кредитной организацией функций клиринговой организации.
 * 
 * <p>Java class for ClearingOrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingOrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="UIS" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingOrganizationType")
public class ClearingOrganizationType {

    @XmlAttribute(name = "BIC")
    protected String bic;
    @XmlAttribute(name = "UIS", required = true)
    protected String uis;

    /**
     * Gets the value of the bic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBIC() {
        return bic;
    }

    /**
     * Sets the value of the bic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBIC(String value) {
        this.bic = value;
    }

    /**
     * Gets the value of the uis property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUIS() {
        return uis;
    }

    /**
     * Sets the value of the uis property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUIS(String value) {
        this.uis = value;
    }

}
