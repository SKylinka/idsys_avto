
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.AccountType;


/**
 * Participantís Account Information.
 * 
 * <p>Java class for AccountsInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountsInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccIntradayRestrictions" type="{urn:cbr-ru:ed:v2.0}AccIntradayRestrictions" minOccurs="0"/>
 *         &lt;element name="PendingDeletionInfo" type="{urn:cbr-ru:ed:v2.0}PendingDeletionInfo" minOccurs="0"/>
 *         &lt;element name="BalanceSweepingAccount" type="{urn:cbr-ru:ed:v2.0}BalanceSweepingAccount" minOccurs="0"/>
 *         &lt;element name="PoolSPInfo" type="{urn:cbr-ru:ed:v2.0}PoolSPInfo" minOccurs="0"/>
 *         &lt;element name="IPInfo" type="{urn:cbr-ru:ed:v2.0}IPInfoListType" minOccurs="0"/>
 *         &lt;element name="LimitsInfo" type="{urn:cbr-ru:ed:v2.0}LimitsInfo" minOccurs="0"/>
 *         &lt;element name="AuthorizedClaimAuthors" type="{urn:cbr-ru:ed:v2.0}AuthorizedClaimAuthors" minOccurs="0"/>
 *         &lt;element name="ArrestsInfo" type="{urn:cbr-ru:ed:v2.0}ArrestsInfo" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Account" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="AccountType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountType" />
 *       &lt;attribute name="DateOfDeletion" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="DefaultARMNo" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max2TextType" />
 *       &lt;attribute name="UseCorrespAccInFTS" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsInfoType", propOrder = {
    "accIntradayRestrictions",
    "pendingDeletionInfo",
    "balanceSweepingAccount",
    "poolSPInfo",
    "ipInfo",
    "limitsInfo",
    "authorizedClaimAuthors",
    "arrestsInfo"
})
public class AccountsInfoType {

    @XmlElement(name = "AccIntradayRestrictions")
    protected AccIntradayRestrictions accIntradayRestrictions;
    @XmlElement(name = "PendingDeletionInfo")
    protected PendingDeletionInfo pendingDeletionInfo;
    @XmlElement(name = "BalanceSweepingAccount")
    protected BalanceSweepingAccount balanceSweepingAccount;
    @XmlElement(name = "PoolSPInfo")
    protected PoolSPInfo poolSPInfo;
    @XmlElement(name = "IPInfo")
    protected IPInfoListType ipInfo;
    @XmlElement(name = "LimitsInfo")
    protected LimitsInfo limitsInfo;
    @XmlElement(name = "AuthorizedClaimAuthors")
    protected AuthorizedClaimAuthors authorizedClaimAuthors;
    @XmlElement(name = "ArrestsInfo")
    protected ArrestsInfo arrestsInfo;
    @XmlAttribute(name = "Account", required = true)
    protected String account;
    @XmlAttribute(name = "AccountType", required = true)
    protected AccountType accountType;
    @XmlAttribute(name = "DateOfDeletion")
    protected XMLGregorianCalendar dateOfDeletion;
    @XmlAttribute(name = "DefaultARMNo")
    protected String defaultARMNo;
    @XmlAttribute(name = "UseCorrespAccInFTS")
    protected Boolean useCorrespAccInFTS;

    /**
     * Gets the value of the accIntradayRestrictions property.
     * 
     * @return
     *     possible object is
     *     {@link AccIntradayRestrictions }
     *     
     */
    public AccIntradayRestrictions getAccIntradayRestrictions() {
        return accIntradayRestrictions;
    }

    /**
     * Sets the value of the accIntradayRestrictions property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccIntradayRestrictions }
     *     
     */
    public void setAccIntradayRestrictions(AccIntradayRestrictions value) {
        this.accIntradayRestrictions = value;
    }

    /**
     * Gets the value of the pendingDeletionInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PendingDeletionInfo }
     *     
     */
    public PendingDeletionInfo getPendingDeletionInfo() {
        return pendingDeletionInfo;
    }

    /**
     * Sets the value of the pendingDeletionInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PendingDeletionInfo }
     *     
     */
    public void setPendingDeletionInfo(PendingDeletionInfo value) {
        this.pendingDeletionInfo = value;
    }

    /**
     * Gets the value of the balanceSweepingAccount property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceSweepingAccount }
     *     
     */
    public BalanceSweepingAccount getBalanceSweepingAccount() {
        return balanceSweepingAccount;
    }

    /**
     * Sets the value of the balanceSweepingAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceSweepingAccount }
     *     
     */
    public void setBalanceSweepingAccount(BalanceSweepingAccount value) {
        this.balanceSweepingAccount = value;
    }

    /**
     * Gets the value of the poolSPInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PoolSPInfo }
     *     
     */
    public PoolSPInfo getPoolSPInfo() {
        return poolSPInfo;
    }

    /**
     * Sets the value of the poolSPInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PoolSPInfo }
     *     
     */
    public void setPoolSPInfo(PoolSPInfo value) {
        this.poolSPInfo = value;
    }

    /**
     * Gets the value of the ipInfo property.
     * 
     * @return
     *     possible object is
     *     {@link IPInfoListType }
     *     
     */
    public IPInfoListType getIPInfo() {
        return ipInfo;
    }

    /**
     * Sets the value of the ipInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPInfoListType }
     *     
     */
    public void setIPInfo(IPInfoListType value) {
        this.ipInfo = value;
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
     * Gets the value of the authorizedClaimAuthors property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizedClaimAuthors }
     *     
     */
    public AuthorizedClaimAuthors getAuthorizedClaimAuthors() {
        return authorizedClaimAuthors;
    }

    /**
     * Sets the value of the authorizedClaimAuthors property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizedClaimAuthors }
     *     
     */
    public void setAuthorizedClaimAuthors(AuthorizedClaimAuthors value) {
        this.authorizedClaimAuthors = value;
    }

    /**
     * Gets the value of the arrestsInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ArrestsInfo }
     *     
     */
    public ArrestsInfo getArrestsInfo() {
        return arrestsInfo;
    }

    /**
     * Sets the value of the arrestsInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrestsInfo }
     *     
     */
    public void setArrestsInfo(ArrestsInfo value) {
        this.arrestsInfo = value;
    }

    /**
     * Gets the value of the account property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * Sets the value of the account property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccountType(AccountType value) {
        this.accountType = value;
    }

    /**
     * Gets the value of the dateOfDeletion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeletion() {
        return dateOfDeletion;
    }

    /**
     * Sets the value of the dateOfDeletion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeletion(XMLGregorianCalendar value) {
        this.dateOfDeletion = value;
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
     * Gets the value of the useCorrespAccInFTS property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUseCorrespAccInFTS() {
        return useCorrespAccInFTS;
    }

    /**
     * Sets the value of the useCorrespAccInFTS property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUseCorrespAccInFTS(Boolean value) {
        this.useCorrespAccInFTS = value;
    }

}
