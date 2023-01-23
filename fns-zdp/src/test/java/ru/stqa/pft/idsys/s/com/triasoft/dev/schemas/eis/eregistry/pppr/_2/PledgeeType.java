
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Залогодержатель
 * 
 * <p>Java class for PledgeeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PledgeeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Organization" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationType"/>
 *           &lt;element name="PrivatePerson" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonType"/>
 *         &lt;/choice>
 *         &lt;element name="PublicationDisclaimer" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeeType", propOrder = {
    "organization",
    "privatePerson",
    "publicationDisclaimer"
})
public class PledgeeType {

    @XmlElement(name = "Organization")
    protected OrganizationType organization;
    @XmlElement(name = "PrivatePerson")
    protected PrivatePersonType privatePerson;
    @XmlElement(name = "PublicationDisclaimer")
    protected Boolean publicationDisclaimer;

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationType }
     *     
     */
    public OrganizationType getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationType }
     *     
     */
    public void setOrganization(OrganizationType value) {
        this.organization = value;
    }

    /**
     * Gets the value of the privatePerson property.
     * 
     * @return
     *     possible object is
     *     {@link PrivatePersonType }
     *     
     */
    public PrivatePersonType getPrivatePerson() {
        return privatePerson;
    }

    /**
     * Sets the value of the privatePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PrivatePersonType }
     *     
     */
    public void setPrivatePerson(PrivatePersonType value) {
        this.privatePerson = value;
    }

    /**
     * Gets the value of the publicationDisclaimer property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPublicationDisclaimer() {
        return publicationDisclaimer;
    }

    /**
     * Sets the value of the publicationDisclaimer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublicationDisclaimer(Boolean value) {
        this.publicationDisclaimer = value;
    }

}
