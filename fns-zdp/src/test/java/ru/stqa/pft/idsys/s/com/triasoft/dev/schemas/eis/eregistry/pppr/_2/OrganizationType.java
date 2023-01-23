
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Описание российского или иностранного юридического лица
 * 
 * <p>Java class for OrganizationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="RussianOrganization" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}RussianOrganizationType"/>
 *         &lt;element name="ForeignOrganization" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}ForeignOrganizationType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationType", propOrder = {
    "russianOrganization",
    "foreignOrganization"
})
public class OrganizationType {

    @XmlElement(name = "RussianOrganization")
    protected RussianOrganizationType russianOrganization;
    @XmlElement(name = "ForeignOrganization")
    protected ForeignOrganizationType foreignOrganization;

    /**
     * Gets the value of the russianOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link RussianOrganizationType }
     *     
     */
    public RussianOrganizationType getRussianOrganization() {
        return russianOrganization;
    }

    /**
     * Sets the value of the russianOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link RussianOrganizationType }
     *     
     */
    public void setRussianOrganization(RussianOrganizationType value) {
        this.russianOrganization = value;
    }

    /**
     * Gets the value of the foreignOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ForeignOrganizationType }
     *     
     */
    public ForeignOrganizationType getForeignOrganization() {
        return foreignOrganization;
    }

    /**
     * Sets the value of the foreignOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ForeignOrganizationType }
     *     
     */
    public void setForeignOrganization(ForeignOrganizationType value) {
        this.foreignOrganization = value;
    }

}
