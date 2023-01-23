
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Выданное согласие в рамках ответа на запрос перечня согласий пользователя ЕСИА
 * 
 * <p>Java class for IssuedPermission complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedPermission">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="personId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="orgId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="permissionId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sysname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="extContext" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orgShortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ogrn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orgAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="responsibleObject" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expired" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="issuedOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="expiredOn" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="sessionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="createdOn" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="scope" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}PermissionScope" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="purpose" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *         &lt;element name="site" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}siteType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}termType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="forbidden" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}forbiddenType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedPermission", propOrder = {
    "id",
    "personId",
    "orgId",
    "permissionId",
    "sysname",
    "name",
    "description",
    "extContext",
    "orgShortName",
    "ogrn",
    "orgAddress",
    "responsibleObject",
    "expired",
    "issuedOn",
    "expiredOn",
    "sessionId",
    "status",
    "createdOn",
    "scope",
    "purpose",
    "action",
    "site",
    "term",
    "forbidden"
})
public class IssuedPermission {

    protected int id;
    protected int personId;
    protected int orgId;
    protected int permissionId;
    @XmlElement(required = true)
    protected String sysname;
    @XmlElement(required = true)
    protected String name;
    protected String description;
    protected String extContext;
    @XmlElement(required = true)
    protected String orgShortName;
    @XmlElement(required = true)
    protected String ogrn;
    protected String orgAddress;
    protected String responsibleObject;
    protected Long expired;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar issuedOn;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiredOn;
    protected String sessionId;
    @XmlElement(required = true)
    protected String status;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdOn;
    protected List<PermissionScope> scope;
    @XmlElement(required = true)
    protected List<String> purpose;
    @XmlElement(required = true)
    protected List<String> action;
    protected List<SiteType> site;
    protected List<TermType> term;
    protected List<ForbiddenType> forbidden;

    /**
     * Gets the value of the id property.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Gets the value of the personId property.
     * 
     */
    public int getPersonId() {
        return personId;
    }

    /**
     * Sets the value of the personId property.
     * 
     */
    public void setPersonId(int value) {
        this.personId = value;
    }

    /**
     * Gets the value of the orgId property.
     * 
     */
    public int getOrgId() {
        return orgId;
    }

    /**
     * Sets the value of the orgId property.
     * 
     */
    public void setOrgId(int value) {
        this.orgId = value;
    }

    /**
     * Gets the value of the permissionId property.
     * 
     */
    public int getPermissionId() {
        return permissionId;
    }

    /**
     * Sets the value of the permissionId property.
     * 
     */
    public void setPermissionId(int value) {
        this.permissionId = value;
    }

    /**
     * Gets the value of the sysname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSysname() {
        return sysname;
    }

    /**
     * Sets the value of the sysname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSysname(String value) {
        this.sysname = value;
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

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the extContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtContext() {
        return extContext;
    }

    /**
     * Sets the value of the extContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtContext(String value) {
        this.extContext = value;
    }

    /**
     * Gets the value of the orgShortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgShortName() {
        return orgShortName;
    }

    /**
     * Sets the value of the orgShortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgShortName(String value) {
        this.orgShortName = value;
    }

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOgrn() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOgrn(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the orgAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgAddress() {
        return orgAddress;
    }

    /**
     * Sets the value of the orgAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgAddress(String value) {
        this.orgAddress = value;
    }

    /**
     * Gets the value of the responsibleObject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponsibleObject() {
        return responsibleObject;
    }

    /**
     * Sets the value of the responsibleObject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponsibleObject(String value) {
        this.responsibleObject = value;
    }

    /**
     * Gets the value of the expired property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getExpired() {
        return expired;
    }

    /**
     * Sets the value of the expired property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setExpired(Long value) {
        this.expired = value;
    }

    /**
     * Gets the value of the issuedOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIssuedOn() {
        return issuedOn;
    }

    /**
     * Sets the value of the issuedOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIssuedOn(XMLGregorianCalendar value) {
        this.issuedOn = value;
    }

    /**
     * Gets the value of the expiredOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiredOn() {
        return expiredOn;
    }

    /**
     * Sets the value of the expiredOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiredOn(XMLGregorianCalendar value) {
        this.expiredOn = value;
    }

    /**
     * Gets the value of the sessionId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * Sets the value of the sessionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionId(String value) {
        this.sessionId = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the createdOn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedOn() {
        return createdOn;
    }

    /**
     * Sets the value of the createdOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedOn(XMLGregorianCalendar value) {
        this.createdOn = value;
    }

    /**
     * Gets the value of the scope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PermissionScope }
     * 
     * 
     */
    public List<PermissionScope> getScope() {
        if (scope == null) {
            scope = new ArrayList<PermissionScope>();
        }
        return this.scope;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the purpose property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPurpose().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPurpose() {
        if (purpose == null) {
            purpose = new ArrayList<String>();
        }
        return this.purpose;
    }

    /**
     * Gets the value of the action property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the action property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAction() {
        if (action == null) {
            action = new ArrayList<String>();
        }
        return this.action;
    }

    /**
     * Gets the value of the site property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the site property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSite().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SiteType }
     * 
     * 
     */
    public List<SiteType> getSite() {
        if (site == null) {
            site = new ArrayList<SiteType>();
        }
        return this.site;
    }

    /**
     * Gets the value of the term property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the term property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTerm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TermType }
     * 
     * 
     */
    public List<TermType> getTerm() {
        if (term == null) {
            term = new ArrayList<TermType>();
        }
        return this.term;
    }

    /**
     * Gets the value of the forbidden property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the forbidden property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForbidden().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForbiddenType }
     * 
     * 
     */
    public List<ForbiddenType> getForbidden() {
        if (forbidden == null) {
            forbidden = new ArrayList<ForbiddenType>();
        }
        return this.forbidden;
    }

}
