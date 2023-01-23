
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Основные данные уведомления 2.0
 * 
 * <p>Java class for PledgeNotificationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PledgeNotificationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FormUZ1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PersonalProperties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PersonalProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PersonalPropertyType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pledgors">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Pledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgorType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pledgee">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Pledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PledgeContract" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeContractType" minOccurs="0"/>
 *                   &lt;element name="NotificationApplicant" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationApplicantType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormUI1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
 *                   &lt;element name="PersonalProperties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PersonalProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PersonalPropertyType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pledgors" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Pledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgorType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pledgee" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Pledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeeType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PledgeContract" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeContractType" minOccurs="0"/>
 *                   &lt;element name="NotificationApplicant" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationApplicantType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormUP1">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
 *                   &lt;element name="NotificationApplicant" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationApplicantType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormUZ2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BondObligationProperties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BondObligationProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPropertyType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BondObligationPledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationType"/>
 *                   &lt;element name="BondObligationPledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPledgeeType" minOccurs="0"/>
 *                   &lt;element name="BondObligationResolution" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationResolutionType"/>
 *                   &lt;element name="BondObligationAttorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationAttorneyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormUI2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
 *                   &lt;element name="BondObligationProperties" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BondObligationProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPropertyType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BondObligationPledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationType" minOccurs="0"/>
 *                   &lt;element name="BondObligationPledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPledgeeType" minOccurs="0"/>
 *                   &lt;element name="BondObligationResolution" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationResolutionType" minOccurs="0"/>
 *                   &lt;element name="BondObligationAttorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationAttorneyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FormUP2">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
 *                   &lt;element name="BondObligationAttorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationAttorneyType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="2.0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PledgeNotificationDataType", propOrder = {
    "formUZ1",
    "formUI1",
    "formUP1",
    "formUZ2",
    "formUI2",
    "formUP2"
})
public class PledgeNotificationDataType {

    @XmlElement(name = "FormUZ1")
    protected PledgeNotificationDataType.FormUZ1 formUZ1;
    @XmlElement(name = "FormUI1")
    protected PledgeNotificationDataType.FormUI1 formUI1;
    @XmlElement(name = "FormUP1")
    protected PledgeNotificationDataType.FormUP1 formUP1;
    @XmlElement(name = "FormUZ2")
    protected PledgeNotificationDataType.FormUZ2 formUZ2;
    @XmlElement(name = "FormUI2")
    protected PledgeNotificationDataType.FormUI2 formUI2;
    @XmlElement(name = "FormUP2")
    protected PledgeNotificationDataType.FormUP2 formUP2;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Gets the value of the formUZ1 property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType.FormUZ1 }
     *     
     */
    public PledgeNotificationDataType.FormUZ1 getFormUZ1() {
        return formUZ1;
    }

    /**
     * Sets the value of the formUZ1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType.FormUZ1 }
     *     
     */
    public void setFormUZ1(PledgeNotificationDataType.FormUZ1 value) {
        this.formUZ1 = value;
    }

    /**
     * Gets the value of the formUI1 property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType.FormUI1 }
     *     
     */
    public PledgeNotificationDataType.FormUI1 getFormUI1() {
        return formUI1;
    }

    /**
     * Sets the value of the formUI1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType.FormUI1 }
     *     
     */
    public void setFormUI1(PledgeNotificationDataType.FormUI1 value) {
        this.formUI1 = value;
    }

    /**
     * Gets the value of the formUP1 property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType.FormUP1 }
     *     
     */
    public PledgeNotificationDataType.FormUP1 getFormUP1() {
        return formUP1;
    }

    /**
     * Sets the value of the formUP1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType.FormUP1 }
     *     
     */
    public void setFormUP1(PledgeNotificationDataType.FormUP1 value) {
        this.formUP1 = value;
    }

    /**
     * Gets the value of the formUZ2 property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType.FormUZ2 }
     *     
     */
    public PledgeNotificationDataType.FormUZ2 getFormUZ2() {
        return formUZ2;
    }

    /**
     * Sets the value of the formUZ2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType.FormUZ2 }
     *     
     */
    public void setFormUZ2(PledgeNotificationDataType.FormUZ2 value) {
        this.formUZ2 = value;
    }

    /**
     * Gets the value of the formUI2 property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType.FormUI2 }
     *     
     */
    public PledgeNotificationDataType.FormUI2 getFormUI2() {
        return formUI2;
    }

    /**
     * Sets the value of the formUI2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType.FormUI2 }
     *     
     */
    public void setFormUI2(PledgeNotificationDataType.FormUI2 value) {
        this.formUI2 = value;
    }

    /**
     * Gets the value of the formUP2 property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationDataType.FormUP2 }
     *     
     */
    public PledgeNotificationDataType.FormUP2 getFormUP2() {
        return formUP2;
    }

    /**
     * Sets the value of the formUP2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationDataType.FormUP2 }
     *     
     */
    public void setFormUP2(PledgeNotificationDataType.FormUP2 value) {
        this.formUP2 = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
     *         &lt;element name="PersonalProperties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PersonalProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PersonalPropertyType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pledgors" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Pledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgorType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pledgee" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Pledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeeType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PledgeContract" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeContractType" minOccurs="0"/>
     *         &lt;element name="NotificationApplicant" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationApplicantType"/>
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
        "creationReferenceNumber",
        "personalProperties",
        "pledgors",
        "pledgee",
        "pledgeContract",
        "notificationApplicant"
    })
    public static class FormUI1 {

        @XmlElement(name = "CreationReferenceNumber", required = true)
        protected String creationReferenceNumber;
        @XmlElement(name = "PersonalProperties")
        protected PledgeNotificationDataType.FormUI1 .PersonalProperties personalProperties;
        @XmlElement(name = "Pledgors")
        protected PledgeNotificationDataType.FormUI1 .Pledgors pledgors;
        @XmlElement(name = "Pledgee")
        protected PledgeNotificationDataType.FormUI1 .Pledgee pledgee;
        @XmlElement(name = "PledgeContract")
        protected PledgeContractType pledgeContract;
        @XmlElement(name = "NotificationApplicant", required = true)
        protected PledgeNotificationApplicantType notificationApplicant;

        /**
         * Gets the value of the creationReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreationReferenceNumber() {
            return creationReferenceNumber;
        }

        /**
         * Sets the value of the creationReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreationReferenceNumber(String value) {
            this.creationReferenceNumber = value;
        }

        /**
         * Gets the value of the personalProperties property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUI1 .PersonalProperties }
         *     
         */
        public PledgeNotificationDataType.FormUI1 .PersonalProperties getPersonalProperties() {
            return personalProperties;
        }

        /**
         * Sets the value of the personalProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUI1 .PersonalProperties }
         *     
         */
        public void setPersonalProperties(PledgeNotificationDataType.FormUI1 .PersonalProperties value) {
            this.personalProperties = value;
        }

        /**
         * Gets the value of the pledgors property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUI1 .Pledgors }
         *     
         */
        public PledgeNotificationDataType.FormUI1 .Pledgors getPledgors() {
            return pledgors;
        }

        /**
         * Sets the value of the pledgors property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUI1 .Pledgors }
         *     
         */
        public void setPledgors(PledgeNotificationDataType.FormUI1 .Pledgors value) {
            this.pledgors = value;
        }

        /**
         * Gets the value of the pledgee property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUI1 .Pledgee }
         *     
         */
        public PledgeNotificationDataType.FormUI1 .Pledgee getPledgee() {
            return pledgee;
        }

        /**
         * Sets the value of the pledgee property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUI1 .Pledgee }
         *     
         */
        public void setPledgee(PledgeNotificationDataType.FormUI1 .Pledgee value) {
            this.pledgee = value;
        }

        /**
         * Gets the value of the pledgeContract property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeContractType }
         *     
         */
        public PledgeContractType getPledgeContract() {
            return pledgeContract;
        }

        /**
         * Sets the value of the pledgeContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeContractType }
         *     
         */
        public void setPledgeContract(PledgeContractType value) {
            this.pledgeContract = value;
        }

        /**
         * Gets the value of the notificationApplicant property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationApplicantType }
         *     
         */
        public PledgeNotificationApplicantType getNotificationApplicant() {
            return notificationApplicant;
        }

        /**
         * Sets the value of the notificationApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationApplicantType }
         *     
         */
        public void setNotificationApplicant(PledgeNotificationApplicantType value) {
            this.notificationApplicant = value;
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
         *         &lt;element name="PersonalProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PersonalPropertyType" maxOccurs="unbounded"/>
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
            "personalProperty"
        })
        public static class PersonalProperties {

            @XmlElement(name = "PersonalProperty", required = true)
            protected List<PersonalPropertyType> personalProperty;

            /**
             * Gets the value of the personalProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the personalProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPersonalProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonalPropertyType }
             * 
             * 
             */
            public List<PersonalPropertyType> getPersonalProperty() {
                if (personalProperty == null) {
                    personalProperty = new ArrayList<PersonalPropertyType>();
                }
                return this.personalProperty;
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
         *         &lt;element name="Pledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeeType" maxOccurs="unbounded"/>
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
            "pledgee"
        })
        public static class Pledgee {

            @XmlElement(name = "Pledgee", required = true)
            protected List<PledgeeType> pledgee;

            /**
             * Gets the value of the pledgee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pledgee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPledgee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PledgeeType }
             * 
             * 
             */
            public List<PledgeeType> getPledgee() {
                if (pledgee == null) {
                    pledgee = new ArrayList<PledgeeType>();
                }
                return this.pledgee;
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
         *         &lt;element name="Pledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgorType" maxOccurs="unbounded"/>
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
            "pledgor"
        })
        public static class Pledgors {

            @XmlElement(name = "Pledgor", required = true)
            protected List<PledgorType> pledgor;

            /**
             * Gets the value of the pledgor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pledgor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPledgor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PledgorType }
             * 
             * 
             */
            public List<PledgorType> getPledgor() {
                if (pledgor == null) {
                    pledgor = new ArrayList<PledgorType>();
                }
                return this.pledgor;
            }

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
     *         &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
     *         &lt;element name="BondObligationProperties" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BondObligationProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPropertyType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BondObligationPledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationType" minOccurs="0"/>
     *         &lt;element name="BondObligationPledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPledgeeType" minOccurs="0"/>
     *         &lt;element name="BondObligationResolution" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationResolutionType" minOccurs="0"/>
     *         &lt;element name="BondObligationAttorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationAttorneyType"/>
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
        "creationReferenceNumber",
        "bondObligationProperties",
        "bondObligationPledgor",
        "bondObligationPledgee",
        "bondObligationResolution",
        "bondObligationAttorney"
    })
    public static class FormUI2 {

        @XmlElement(name = "CreationReferenceNumber", required = true)
        protected String creationReferenceNumber;
        @XmlElement(name = "BondObligationProperties")
        protected PledgeNotificationDataType.FormUI2 .BondObligationProperties bondObligationProperties;
        @XmlElement(name = "BondObligationPledgor")
        protected OrganizationType bondObligationPledgor;
        @XmlElement(name = "BondObligationPledgee")
        protected BondObligationPledgeeType bondObligationPledgee;
        @XmlElement(name = "BondObligationResolution")
        protected BondObligationResolutionType bondObligationResolution;
        @XmlElement(name = "BondObligationAttorney", required = true)
        protected BondObligationAttorneyType bondObligationAttorney;

        /**
         * Gets the value of the creationReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreationReferenceNumber() {
            return creationReferenceNumber;
        }

        /**
         * Sets the value of the creationReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreationReferenceNumber(String value) {
            this.creationReferenceNumber = value;
        }

        /**
         * Gets the value of the bondObligationProperties property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUI2 .BondObligationProperties }
         *     
         */
        public PledgeNotificationDataType.FormUI2 .BondObligationProperties getBondObligationProperties() {
            return bondObligationProperties;
        }

        /**
         * Sets the value of the bondObligationProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUI2 .BondObligationProperties }
         *     
         */
        public void setBondObligationProperties(PledgeNotificationDataType.FormUI2 .BondObligationProperties value) {
            this.bondObligationProperties = value;
        }

        /**
         * Gets the value of the bondObligationPledgor property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationType }
         *     
         */
        public OrganizationType getBondObligationPledgor() {
            return bondObligationPledgor;
        }

        /**
         * Sets the value of the bondObligationPledgor property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationType }
         *     
         */
        public void setBondObligationPledgor(OrganizationType value) {
            this.bondObligationPledgor = value;
        }

        /**
         * Gets the value of the bondObligationPledgee property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationPledgeeType }
         *     
         */
        public BondObligationPledgeeType getBondObligationPledgee() {
            return bondObligationPledgee;
        }

        /**
         * Sets the value of the bondObligationPledgee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationPledgeeType }
         *     
         */
        public void setBondObligationPledgee(BondObligationPledgeeType value) {
            this.bondObligationPledgee = value;
        }

        /**
         * Gets the value of the bondObligationResolution property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationResolutionType }
         *     
         */
        public BondObligationResolutionType getBondObligationResolution() {
            return bondObligationResolution;
        }

        /**
         * Sets the value of the bondObligationResolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationResolutionType }
         *     
         */
        public void setBondObligationResolution(BondObligationResolutionType value) {
            this.bondObligationResolution = value;
        }

        /**
         * Gets the value of the bondObligationAttorney property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationAttorneyType }
         *     
         */
        public BondObligationAttorneyType getBondObligationAttorney() {
            return bondObligationAttorney;
        }

        /**
         * Sets the value of the bondObligationAttorney property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationAttorneyType }
         *     
         */
        public void setBondObligationAttorney(BondObligationAttorneyType value) {
            this.bondObligationAttorney = value;
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
         *         &lt;element name="BondObligationProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPropertyType" maxOccurs="unbounded"/>
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
            "bondObligationProperty"
        })
        public static class BondObligationProperties {

            @XmlElement(name = "BondObligationProperty", required = true)
            protected List<BondObligationPropertyType> bondObligationProperty;

            /**
             * Gets the value of the bondObligationProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bondObligationProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBondObligationProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BondObligationPropertyType }
             * 
             * 
             */
            public List<BondObligationPropertyType> getBondObligationProperty() {
                if (bondObligationProperty == null) {
                    bondObligationProperty = new ArrayList<BondObligationPropertyType>();
                }
                return this.bondObligationProperty;
            }

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
     *         &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
     *         &lt;element name="NotificationApplicant" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationApplicantType"/>
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
        "creationReferenceNumber",
        "notificationApplicant"
    })
    public static class FormUP1 {

        @XmlElement(name = "CreationReferenceNumber", required = true)
        protected String creationReferenceNumber;
        @XmlElement(name = "NotificationApplicant", required = true)
        protected PledgeNotificationApplicantType notificationApplicant;

        /**
         * Gets the value of the creationReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreationReferenceNumber() {
            return creationReferenceNumber;
        }

        /**
         * Sets the value of the creationReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreationReferenceNumber(String value) {
            this.creationReferenceNumber = value;
        }

        /**
         * Gets the value of the notificationApplicant property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationApplicantType }
         *     
         */
        public PledgeNotificationApplicantType getNotificationApplicant() {
            return notificationApplicant;
        }

        /**
         * Sets the value of the notificationApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationApplicantType }
         *     
         */
        public void setNotificationApplicant(PledgeNotificationApplicantType value) {
            this.notificationApplicant = value;
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
     *         &lt;element name="CreationReferenceNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}CreationReferenceNumberType"/>
     *         &lt;element name="BondObligationAttorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationAttorneyType"/>
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
        "creationReferenceNumber",
        "bondObligationAttorney"
    })
    public static class FormUP2 {

        @XmlElement(name = "CreationReferenceNumber", required = true)
        protected String creationReferenceNumber;
        @XmlElement(name = "BondObligationAttorney", required = true)
        protected BondObligationAttorneyType bondObligationAttorney;

        /**
         * Gets the value of the creationReferenceNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCreationReferenceNumber() {
            return creationReferenceNumber;
        }

        /**
         * Sets the value of the creationReferenceNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCreationReferenceNumber(String value) {
            this.creationReferenceNumber = value;
        }

        /**
         * Gets the value of the bondObligationAttorney property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationAttorneyType }
         *     
         */
        public BondObligationAttorneyType getBondObligationAttorney() {
            return bondObligationAttorney;
        }

        /**
         * Sets the value of the bondObligationAttorney property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationAttorneyType }
         *     
         */
        public void setBondObligationAttorney(BondObligationAttorneyType value) {
            this.bondObligationAttorney = value;
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
     *         &lt;element name="PersonalProperties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PersonalProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PersonalPropertyType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pledgors">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Pledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgorType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pledgee">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Pledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeeType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PledgeContract" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeContractType" minOccurs="0"/>
     *         &lt;element name="NotificationApplicant" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeNotificationApplicantType"/>
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
        "personalProperties",
        "pledgors",
        "pledgee",
        "pledgeContract",
        "notificationApplicant"
    })
    public static class FormUZ1 {

        @XmlElement(name = "PersonalProperties", required = true)
        protected PledgeNotificationDataType.FormUZ1 .PersonalProperties personalProperties;
        @XmlElement(name = "Pledgors", required = true)
        protected PledgeNotificationDataType.FormUZ1 .Pledgors pledgors;
        @XmlElement(name = "Pledgee", required = true)
        protected PledgeNotificationDataType.FormUZ1 .Pledgee pledgee;
        @XmlElement(name = "PledgeContract")
        protected PledgeContractType pledgeContract;
        @XmlElement(name = "NotificationApplicant", required = true)
        protected PledgeNotificationApplicantType notificationApplicant;

        /**
         * Gets the value of the personalProperties property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUZ1 .PersonalProperties }
         *     
         */
        public PledgeNotificationDataType.FormUZ1 .PersonalProperties getPersonalProperties() {
            return personalProperties;
        }

        /**
         * Sets the value of the personalProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUZ1 .PersonalProperties }
         *     
         */
        public void setPersonalProperties(PledgeNotificationDataType.FormUZ1 .PersonalProperties value) {
            this.personalProperties = value;
        }

        /**
         * Gets the value of the pledgors property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUZ1 .Pledgors }
         *     
         */
        public PledgeNotificationDataType.FormUZ1 .Pledgors getPledgors() {
            return pledgors;
        }

        /**
         * Sets the value of the pledgors property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUZ1 .Pledgors }
         *     
         */
        public void setPledgors(PledgeNotificationDataType.FormUZ1 .Pledgors value) {
            this.pledgors = value;
        }

        /**
         * Gets the value of the pledgee property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUZ1 .Pledgee }
         *     
         */
        public PledgeNotificationDataType.FormUZ1 .Pledgee getPledgee() {
            return pledgee;
        }

        /**
         * Sets the value of the pledgee property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUZ1 .Pledgee }
         *     
         */
        public void setPledgee(PledgeNotificationDataType.FormUZ1 .Pledgee value) {
            this.pledgee = value;
        }

        /**
         * Gets the value of the pledgeContract property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeContractType }
         *     
         */
        public PledgeContractType getPledgeContract() {
            return pledgeContract;
        }

        /**
         * Sets the value of the pledgeContract property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeContractType }
         *     
         */
        public void setPledgeContract(PledgeContractType value) {
            this.pledgeContract = value;
        }

        /**
         * Gets the value of the notificationApplicant property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationApplicantType }
         *     
         */
        public PledgeNotificationApplicantType getNotificationApplicant() {
            return notificationApplicant;
        }

        /**
         * Sets the value of the notificationApplicant property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationApplicantType }
         *     
         */
        public void setNotificationApplicant(PledgeNotificationApplicantType value) {
            this.notificationApplicant = value;
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
         *         &lt;element name="PersonalProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PersonalPropertyType" maxOccurs="unbounded"/>
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
            "personalProperty"
        })
        public static class PersonalProperties {

            @XmlElement(name = "PersonalProperty", required = true)
            protected List<PersonalPropertyType> personalProperty;

            /**
             * Gets the value of the personalProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the personalProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPersonalProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PersonalPropertyType }
             * 
             * 
             */
            public List<PersonalPropertyType> getPersonalProperty() {
                if (personalProperty == null) {
                    personalProperty = new ArrayList<PersonalPropertyType>();
                }
                return this.personalProperty;
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
         *         &lt;element name="Pledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgeeType" maxOccurs="unbounded"/>
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
            "pledgee"
        })
        public static class Pledgee {

            @XmlElement(name = "Pledgee", required = true)
            protected List<PledgeeType> pledgee;

            /**
             * Gets the value of the pledgee property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pledgee property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPledgee().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PledgeeType }
             * 
             * 
             */
            public List<PledgeeType> getPledgee() {
                if (pledgee == null) {
                    pledgee = new ArrayList<PledgeeType>();
                }
                return this.pledgee;
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
         *         &lt;element name="Pledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PledgorType" maxOccurs="unbounded"/>
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
            "pledgor"
        })
        public static class Pledgors {

            @XmlElement(name = "Pledgor", required = true)
            protected List<PledgorType> pledgor;

            /**
             * Gets the value of the pledgor property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pledgor property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPledgor().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PledgorType }
             * 
             * 
             */
            public List<PledgorType> getPledgor() {
                if (pledgor == null) {
                    pledgor = new ArrayList<PledgorType>();
                }
                return this.pledgor;
            }

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
     *         &lt;element name="BondObligationProperties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BondObligationProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPropertyType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BondObligationPledgor" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OrganizationType"/>
     *         &lt;element name="BondObligationPledgee" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPledgeeType" minOccurs="0"/>
     *         &lt;element name="BondObligationResolution" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationResolutionType"/>
     *         &lt;element name="BondObligationAttorney" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationAttorneyType"/>
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
        "bondObligationProperties",
        "bondObligationPledgor",
        "bondObligationPledgee",
        "bondObligationResolution",
        "bondObligationAttorney"
    })
    public static class FormUZ2 {

        @XmlElement(name = "BondObligationProperties", required = true)
        protected PledgeNotificationDataType.FormUZ2 .BondObligationProperties bondObligationProperties;
        @XmlElement(name = "BondObligationPledgor", required = true)
        protected OrganizationType bondObligationPledgor;
        @XmlElement(name = "BondObligationPledgee")
        protected BondObligationPledgeeType bondObligationPledgee;
        @XmlElement(name = "BondObligationResolution", required = true)
        protected BondObligationResolutionType bondObligationResolution;
        @XmlElement(name = "BondObligationAttorney", required = true)
        protected BondObligationAttorneyType bondObligationAttorney;

        /**
         * Gets the value of the bondObligationProperties property.
         * 
         * @return
         *     possible object is
         *     {@link PledgeNotificationDataType.FormUZ2 .BondObligationProperties }
         *     
         */
        public PledgeNotificationDataType.FormUZ2 .BondObligationProperties getBondObligationProperties() {
            return bondObligationProperties;
        }

        /**
         * Sets the value of the bondObligationProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link PledgeNotificationDataType.FormUZ2 .BondObligationProperties }
         *     
         */
        public void setBondObligationProperties(PledgeNotificationDataType.FormUZ2 .BondObligationProperties value) {
            this.bondObligationProperties = value;
        }

        /**
         * Gets the value of the bondObligationPledgor property.
         * 
         * @return
         *     possible object is
         *     {@link OrganizationType }
         *     
         */
        public OrganizationType getBondObligationPledgor() {
            return bondObligationPledgor;
        }

        /**
         * Sets the value of the bondObligationPledgor property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrganizationType }
         *     
         */
        public void setBondObligationPledgor(OrganizationType value) {
            this.bondObligationPledgor = value;
        }

        /**
         * Gets the value of the bondObligationPledgee property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationPledgeeType }
         *     
         */
        public BondObligationPledgeeType getBondObligationPledgee() {
            return bondObligationPledgee;
        }

        /**
         * Sets the value of the bondObligationPledgee property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationPledgeeType }
         *     
         */
        public void setBondObligationPledgee(BondObligationPledgeeType value) {
            this.bondObligationPledgee = value;
        }

        /**
         * Gets the value of the bondObligationResolution property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationResolutionType }
         *     
         */
        public BondObligationResolutionType getBondObligationResolution() {
            return bondObligationResolution;
        }

        /**
         * Sets the value of the bondObligationResolution property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationResolutionType }
         *     
         */
        public void setBondObligationResolution(BondObligationResolutionType value) {
            this.bondObligationResolution = value;
        }

        /**
         * Gets the value of the bondObligationAttorney property.
         * 
         * @return
         *     possible object is
         *     {@link BondObligationAttorneyType }
         *     
         */
        public BondObligationAttorneyType getBondObligationAttorney() {
            return bondObligationAttorney;
        }

        /**
         * Sets the value of the bondObligationAttorney property.
         * 
         * @param value
         *     allowed object is
         *     {@link BondObligationAttorneyType }
         *     
         */
        public void setBondObligationAttorney(BondObligationAttorneyType value) {
            this.bondObligationAttorney = value;
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
         *         &lt;element name="BondObligationProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}BondObligationPropertyType" maxOccurs="unbounded"/>
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
            "bondObligationProperty"
        })
        public static class BondObligationProperties {

            @XmlElement(name = "BondObligationProperty", required = true)
            protected List<BondObligationPropertyType> bondObligationProperty;

            /**
             * Gets the value of the bondObligationProperty property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bondObligationProperty property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBondObligationProperty().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BondObligationPropertyType }
             * 
             * 
             */
            public List<BondObligationPropertyType> getBondObligationProperty() {
                if (bondObligationProperty == null) {
                    bondObligationProperty = new ArrayList<BondObligationPropertyType>();
                }
                return this.bondObligationProperty;
            }

        }

    }

}
