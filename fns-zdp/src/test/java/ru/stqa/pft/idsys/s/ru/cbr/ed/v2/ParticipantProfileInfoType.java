
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Participant Profile Information.
 * 
 * <p>Java class for ParticipantProfileInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantProfileInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UFCFInfo" type="{urn:cbr-ru:ed:v2.0}UFCFInfo" minOccurs="0"/>
 *         &lt;element name="IntradayRestrictions" type="{urn:cbr-ru:ed:v2.0}IntradayRestrictions" minOccurs="0"/>
 *         &lt;element name="ParticipantAttributes" type="{urn:cbr-ru:ed:v2.0}ParticipantAttributes"/>
 *         &lt;element name="EPSInfo" type="{urn:cbr-ru:ed:v2.0}EPSInfo" minOccurs="0"/>
 *         &lt;element name="AccountsAuthorizedForDD" type="{urn:cbr-ru:ed:v2.0}AuthClaimAuthorType" minOccurs="0"/>
 *         &lt;element name="AuthorizedClaimAuthorsForIP" type="{urn:cbr-ru:ed:v2.0}AuthorizedClaimAuthorsForIP" minOccurs="0"/>
 *         &lt;element name="LimitsInfo" type="{urn:cbr-ru:ed:v2.0}LimitsInfo" minOccurs="0"/>
 *         &lt;element name="DirectParticipantBICAccount" type="{urn:cbr-ru:ed:v2.0}DirectParticipantBICAccountType" minOccurs="0"/>
 *         &lt;element name="AccountStatementList" type="{urn:cbr-ru:ed:v2.0}AccountStatementListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClearingOrganization" type="{urn:cbr-ru:ed:v2.0}ClearingOrganizationType" minOccurs="0"/>
 *         &lt;element name="ForeignCorrespOrganizations" type="{urn:cbr-ru:ed:v2.0}ForeignCorrespOrganizationsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PtType" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max2TextType" />
 *       &lt;attribute name="ServCBRBIC" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="DefaultARMNo" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max2TextType" />
 *       &lt;attribute name="ChannelMode" type="{urn:cbr-ru:ed:leaftypes:v2.0}OneDigitCodeType" fixed="3" />
 *       &lt;attribute name="INN" type="{urn:cbr-ru:ed:leaftypes:v2.0}INNIDTextType" />
 *       &lt;attribute name="IsISO" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantProfileInfoType", propOrder = {
    "ufcfInfo",
    "intradayRestrictions",
    "participantAttributes",
    "epsInfo",
    "accountsAuthorizedForDD",
    "authorizedClaimAuthorsForIP",
    "limitsInfo",
    "directParticipantBICAccount",
    "accountStatementList",
    "clearingOrganization",
    "foreignCorrespOrganizations"
})
public class ParticipantProfileInfoType {

    @XmlElement(name = "UFCFInfo")
    protected UFCFInfo ufcfInfo;
    @XmlElement(name = "IntradayRestrictions")
    protected IntradayRestrictions intradayRestrictions;
    @XmlElement(name = "ParticipantAttributes", required = true)
    protected ParticipantAttributes participantAttributes;
    @XmlElement(name = "EPSInfo")
    protected EPSInfo epsInfo;
    @XmlElement(name = "AccountsAuthorizedForDD")
    protected AuthClaimAuthorType accountsAuthorizedForDD;
    @XmlElement(name = "AuthorizedClaimAuthorsForIP")
    protected AuthorizedClaimAuthorsForIP authorizedClaimAuthorsForIP;
    @XmlElement(name = "LimitsInfo")
    protected LimitsInfo limitsInfo;
    @XmlElement(name = "DirectParticipantBICAccount")
    protected DirectParticipantBICAccountType directParticipantBICAccount;
    @XmlElement(name = "AccountStatementList")
    protected List<AccountStatementListType> accountStatementList;
    @XmlElement(name = "ClearingOrganization")
    protected ClearingOrganizationType clearingOrganization;
    @XmlElement(name = "ForeignCorrespOrganizations")
    protected List<ForeignCorrespOrganizationsType> foreignCorrespOrganizations;
    @XmlAttribute(name = "PtType")
    protected String ptType;
    @XmlAttribute(name = "ServCBRBIC")
    protected String servCBRBIC;
    @XmlAttribute(name = "DefaultARMNo")
    protected String defaultARMNo;
    @XmlAttribute(name = "ChannelMode")
    protected String channelMode;
    @XmlAttribute(name = "INN")
    protected String inn;
    @XmlAttribute(name = "IsISO")
    protected Boolean isISO;

    /**
     * Gets the value of the ufcfInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UFCFInfo }
     *     
     */
    public UFCFInfo getUFCFInfo() {
        return ufcfInfo;
    }

    /**
     * Sets the value of the ufcfInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UFCFInfo }
     *     
     */
    public void setUFCFInfo(UFCFInfo value) {
        this.ufcfInfo = value;
    }

    /**
     * Gets the value of the intradayRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link IntradayRestrictions }
     *     
     */
    public IntradayRestrictions getIntradayRestrictions() {
        return intradayRestrictions;
    }

    /**
     * Sets the value of the intradayRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntradayRestrictions }
     *     
     */
    public void setIntradayRestrictions(IntradayRestrictions value) {
        this.intradayRestrictions = value;
    }

    /**
     * Gets the value of the participantAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantAttributes }
     *     
     */
    public ParticipantAttributes getParticipantAttributes() {
        return participantAttributes;
    }

    /**
     * Sets the value of the participantAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantAttributes }
     *     
     */
    public void setParticipantAttributes(ParticipantAttributes value) {
        this.participantAttributes = value;
    }

    /**
     * Gets the value of the epsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link EPSInfo }
     *     
     */
    public EPSInfo getEPSInfo() {
        return epsInfo;
    }

    /**
     * Sets the value of the epsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link EPSInfo }
     *     
     */
    public void setEPSInfo(EPSInfo value) {
        this.epsInfo = value;
    }

    /**
     * Gets the value of the accountsAuthorizedForDD property.
     * 
     * @return
     *     possible object is
     *     {@link AuthClaimAuthorType }
     *     
     */
    public AuthClaimAuthorType getAccountsAuthorizedForDD() {
        return accountsAuthorizedForDD;
    }

    /**
     * Sets the value of the accountsAuthorizedForDD property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthClaimAuthorType }
     *     
     */
    public void setAccountsAuthorizedForDD(AuthClaimAuthorType value) {
        this.accountsAuthorizedForDD = value;
    }

    /**
     * Gets the value of the authorizedClaimAuthorsForIP property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedClaimAuthorsForIP }
     *     
     */
    public AuthorizedClaimAuthorsForIP getAuthorizedClaimAuthorsForIP() {
        return authorizedClaimAuthorsForIP;
    }

    /**
     * Sets the value of the authorizedClaimAuthorsForIP property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedClaimAuthorsForIP }
     *     
     */
    public void setAuthorizedClaimAuthorsForIP(AuthorizedClaimAuthorsForIP value) {
        this.authorizedClaimAuthorsForIP = value;
    }

    /**
     * Gets the value of the limitsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link LimitsInfo }
     *     
     */
    public LimitsInfo getLimitsInfo() {
        return limitsInfo;
    }

    /**
     * Sets the value of the limitsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link LimitsInfo }
     *     
     */
    public void setLimitsInfo(LimitsInfo value) {
        this.limitsInfo = value;
    }

    /**
     * Gets the value of the directParticipantBICAccount property.
     * 
     * @return
     *     possible object is
     *     {@link DirectParticipantBICAccountType }
     *     
     */
    public DirectParticipantBICAccountType getDirectParticipantBICAccount() {
        return directParticipantBICAccount;
    }

    /**
     * Sets the value of the directParticipantBICAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectParticipantBICAccountType }
     *     
     */
    public void setDirectParticipantBICAccount(DirectParticipantBICAccountType value) {
        this.directParticipantBICAccount = value;
    }

    /**
     * Gets the value of the accountStatementList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountStatementList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountStatementList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountStatementListType }
     * 
     * 
     */
    public List<AccountStatementListType> getAccountStatementList() {
        if (accountStatementList == null) {
            accountStatementList = new ArrayList<AccountStatementListType>();
        }
        return this.accountStatementList;
    }

    /**
     * Gets the value of the clearingOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingOrganizationType }
     *     
     */
    public ClearingOrganizationType getClearingOrganization() {
        return clearingOrganization;
    }

    /**
     * Sets the value of the clearingOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingOrganizationType }
     *     
     */
    public void setClearingOrganization(ClearingOrganizationType value) {
        this.clearingOrganization = value;
    }

    /**
     * Gets the value of the foreignCorrespOrganizations property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the foreignCorrespOrganizations property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getForeignCorrespOrganizations().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignCorrespOrganizationsType }
     * 
     * 
     */
    public List<ForeignCorrespOrganizationsType> getForeignCorrespOrganizations() {
        if (foreignCorrespOrganizations == null) {
            foreignCorrespOrganizations = new ArrayList<ForeignCorrespOrganizationsType>();
        }
        return this.foreignCorrespOrganizations;
    }

    /**
     * Gets the value of the ptType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtType() {
        return ptType;
    }

    /**
     * Sets the value of the ptType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtType(String value) {
        this.ptType = value;
    }

    /**
     * Gets the value of the servCBRBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServCBRBIC() {
        return servCBRBIC;
    }

    /**
     * Sets the value of the servCBRBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServCBRBIC(String value) {
        this.servCBRBIC = value;
    }

    /**
     * Gets the value of the defaultARMNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultARMNo() {
        return defaultARMNo;
    }

    /**
     * Sets the value of the defaultARMNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultARMNo(String value) {
        this.defaultARMNo = value;
    }

    /**
     * Gets the value of the channelMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelMode() {
        if (channelMode == null) {
            return "3";
        } else {
            return channelMode;
        }
    }

    /**
     * Sets the value of the channelMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelMode(String value) {
        this.channelMode = value;
    }

    /**
     * Gets the value of the inn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getINN() {
        return inn;
    }

    /**
     * Sets the value of the inn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setINN(String value) {
        this.inn = value;
    }

    /**
     * Gets the value of the isISO property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsISO() {
        return isISO;
    }

    /**
     * Sets the value of the isISO property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsISO(Boolean value) {
        this.isISO = value;
    }

}
