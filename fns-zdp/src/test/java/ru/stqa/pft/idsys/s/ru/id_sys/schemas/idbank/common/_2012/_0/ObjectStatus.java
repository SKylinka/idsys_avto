
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.BankruptcyData;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersRs;


/**
 * Сведения о статусе объекта
 * 
 * <p>Java class for ObjectStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ObjectStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Errors" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Errors" minOccurs="0"/>
 *         &lt;element name="Parameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Parameter" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Parameter" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="objectID" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="objectStatus" use="required" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="objectType" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="ref" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="requestID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ObjectStatus", propOrder = {
    "errors",
    "parameters"
})
@XmlSeeAlso({
    LookupCustomersRs.CustomersData.CustomerData.BankruptcyLookupResults.class,
    LookupCustomersRs.CustomersData.CustomerData.INNMatchResults.class,
    LookupCustomersRs.CustomersData.CustomerData.OMSMatchResults.class,
    LookupCustomersRs.CustomersData.CustomerData.AccountData.class,
    LookupCustomersRs.CustomersData.CustomerData.RestrictionCheckResult.class,
    LookupCustomersRs.CustomersData.CustomerData.INNbyFIO.class,
    LookupCustomersRs.CustomersData.CustomerData.RMSPLookupResult.class,
    LookupCustomersRs.CustomersData.CustomerData.EGRZAGSResult.class,
    LookupCustomersRs.CustomersData.CustomerData.class,
    BankruptcyData.class
})
public class ObjectStatus {

    @XmlElement(name = "Errors")
    protected Errors errors;
    @XmlElement(name = "Parameters")
    protected ObjectStatus.Parameters parameters;
    @XmlAttribute(name = "objectID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectID;
    @XmlAttribute(name = "objectStatus", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectStatus;
    @XmlAttribute(name = "objectType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String objectType;
    @XmlAttribute(name = "ref")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String ref;
    @XmlAttribute(name = "statusName")
    protected String statusName;
    @XmlAttribute(name = "requestID")
    protected Long requestID;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link Errors }
     *     
     */
    public Errors getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Errors }
     *     
     */
    public void setErrors(Errors value) {
        this.errors = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ObjectStatus.Parameters }
     *     
     */
    public ObjectStatus.Parameters getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ObjectStatus.Parameters }
     *     
     */
    public void setParameters(ObjectStatus.Parameters value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the objectID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectID() {
        return objectID;
    }

    /**
     * Sets the value of the objectID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectID(String value) {
        this.objectID = value;
    }

    /**
     * Gets the value of the objectStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectStatus() {
        return objectStatus;
    }

    /**
     * Sets the value of the objectStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectStatus(String value) {
        this.objectStatus = value;
    }

    /**
     * Gets the value of the objectType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjectType() {
        return objectType;
    }

    /**
     * Sets the value of the objectType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjectType(String value) {
        this.objectType = value;
    }

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRef(String value) {
        this.ref = value;
    }

    /**
     * Gets the value of the statusName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Sets the value of the statusName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
    }

    /**
     * Gets the value of the requestID property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRequestID() {
        return requestID;
    }

    /**
     * Sets the value of the requestID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRequestID(Long value) {
        this.requestID = value;
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
     *         &lt;element name="Parameter" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Parameter" maxOccurs="unbounded"/>
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
        "parameter"
    })
    public static class Parameters {

        @XmlElement(name = "Parameter", required = true)
        protected List<Parameter> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Parameter }
         * 
         * 
         */
        public List<Parameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<Parameter>();
            }
            return this.parameter;
        }

    }

}
