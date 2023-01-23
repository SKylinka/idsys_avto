
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Тип Заявитель
 * 
 * <p>Java class for PledgeNotificationApplicantType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PledgeNotificationApplicantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Role" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}ApplicantRoleType"/>
 *         &lt;choice>
 *           &lt;element name="Organization">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="NameFull" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationNameFullType"/>
 *                     &lt;element name="URN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationURNType" minOccurs="0"/>
 *                     &lt;element name="UINN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationUINNType" minOccurs="0"/>
 *                     &lt;element name="Email" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}EmailType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PrivatePerson">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Name" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonNameType"/>
 *                     &lt;element name="Email" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}EmailType" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="Attorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationAttorneyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeNotificationApplicantType", propOrder = {
    "role",
    "organization",
    "privatePerson",
    "attorney"
})
public class PledgeNotificationApplicantType {

    @XmlElement(name = "Role", required = true)
    protected String role;
    @XmlElement(name = "Organization")
    protected PledgeNotificationApplicantType.Organization organization;
    @XmlElement(name = "PrivatePerson")
    protected PledgeNotificationApplicantType.PrivatePerson privatePerson;
    @XmlElement(name = "Attorney")
    protected PledgeNotificationAttorneyType attorney;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRole(String value) {
        this.role = value;
    }

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationApplicantType.Organization }
     *     
     */
    public PledgeNotificationApplicantType.Organization getOrganization() {
        return organization;
    }

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationApplicantType.Organization }
     *     
     */
    public void setOrganization(PledgeNotificationApplicantType.Organization value) {
        this.organization = value;
    }

    /**
     * Gets the value of the privatePerson property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationApplicantType.PrivatePerson }
     *     
     */
    public PledgeNotificationApplicantType.PrivatePerson getPrivatePerson() {
        return privatePerson;
    }

    /**
     * Sets the value of the privatePerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationApplicantType.PrivatePerson }
     *     
     */
    public void setPrivatePerson(PledgeNotificationApplicantType.PrivatePerson value) {
        this.privatePerson = value;
    }

    /**
     * Gets the value of the attorney property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationAttorneyType }
     *     
     */
    public PledgeNotificationAttorneyType getAttorney() {
        return attorney;
    }

    /**
     * Sets the value of the attorney property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationAttorneyType }
     *     
     */
    public void setAttorney(PledgeNotificationAttorneyType value) {
        this.attorney = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="NameFull" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationNameFullType"/>
     *         &lt;element name="URN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationURNType" minOccurs="0"/>
     *         &lt;element name="UINN" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationUINNType" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}EmailType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "nameFull",
        "urn",
        "uinn",
        "email"
    })
    public static class Organization {

        @XmlElement(name = "NameFull", required = true)
        protected String nameFull;
        @XmlElement(name = "URN")
        protected String urn;
        @XmlElement(name = "UINN")
        protected String uinn;
        @XmlElement(name = "Email")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String email;

        /**
         * Gets the value of the nameFull property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameFull() {
            return nameFull;
        }

        /**
         * Sets the value of the nameFull property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameFull(String value) {
            this.nameFull = value;
        }

        /**
         * Gets the value of the urn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURN() {
            return urn;
        }

        /**
         * Sets the value of the urn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURN(String value) {
            this.urn = value;
        }

        /**
         * Gets the value of the uinn property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUINN() {
            return uinn;
        }

        /**
         * Sets the value of the uinn property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUINN(String value) {
            this.uinn = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Name" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonNameType"/>
     *         &lt;element name="Email" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}EmailType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "email"
    })
    public static class PrivatePerson {

        @XmlElement(name = "Name", required = true)
        protected PrivatePersonNameType name;
        @XmlElement(name = "Email")
        @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
        @XmlSchemaType(name = "normalizedString")
        protected String email;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link PrivatePersonNameType }
         *     
         */
        public PrivatePersonNameType getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link PrivatePersonNameType }
         *     
         */
        public void setName(PrivatePersonNameType value) {
            this.name = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

    }

}
