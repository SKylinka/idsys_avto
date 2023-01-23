
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.AccountStatusType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.AccountType;


/**
 * Participant’s Accounts information.
 * 
 * <p>Java class for AccountsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccRstrList" type="{urn:cbr-ru:ed:v2.0}AccRstrListType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Account" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountNumberRUIDType" />
 *       &lt;attribute name="RegulationAccountType" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountType" />
 *       &lt;attribute name="CK" type="{urn:cbr-ru:ed:leaftypes:v2.0}Eq2TextType" />
 *       &lt;attribute name="AccountCBRBIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="DateIn" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="DateOut" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="AccountStatus" type="{urn:cbr-ru:ed:leaftypes:v2.0}AccountStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountsType", propOrder = {
    "accRstrList"
})
public class AccountsType {

    @XmlElement(name = "AccRstrList")
    protected List<AccRstrListType> accRstrList;
    @XmlAttribute(name = "Account", required = true)
    protected String account;
    @XmlAttribute(name = "RegulationAccountType", required = true)
    protected AccountType regulationAccountType;
    @XmlAttribute(name = "CK")
    protected String ck;
    @XmlAttribute(name = "AccountCBRBIC", required = true)
    protected String accountCBRBIC;
    @XmlAttribute(name = "DateIn", required = true)
    protected XMLGregorianCalendar dateIn;
    @XmlAttribute(name = "DateOut")
    protected XMLGregorianCalendar dateOut;
    @XmlAttribute(name = "AccountStatus")
    protected AccountStatusType accountStatus;

    /**
     * Gets the value of the accRstrList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accRstrList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccRstrList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccRstrListType }
     * 
     * 
     */
    public List<AccRstrListType> getAccRstrList() {
        if (accRstrList == null) {
            accRstrList = new ArrayList<AccRstrListType>();
        }
        return this.accRstrList;
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
     * Gets the value of the regulationAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getRegulationAccountType() {
        return regulationAccountType;
    }

    /**
     * Sets the value of the regulationAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setRegulationAccountType(AccountType value) {
        this.regulationAccountType = value;
    }

    /**
     * Gets the value of the ck property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCK() {
        return ck;
    }

    /**
     * Sets the value of the ck property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCK(String value) {
        this.ck = value;
    }

    /**
     * Gets the value of the accountCBRBIC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountCBRBIC() {
        return accountCBRBIC;
    }

    /**
     * Sets the value of the accountCBRBIC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountCBRBIC(String value) {
        this.accountCBRBIC = value;
    }

    /**
     * Gets the value of the dateIn property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateIn() {
        return dateIn;
    }

    /**
     * Sets the value of the dateIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateIn(XMLGregorianCalendar value) {
        this.dateIn = value;
    }

    /**
     * Gets the value of the dateOut property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOut() {
        return dateOut;
    }

    /**
     * Sets the value of the dateOut property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOut(XMLGregorianCalendar value) {
        this.dateOut = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusType }
     *     
     */
    public AccountStatusType getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusType }
     *     
     */
    public void setAccountStatus(AccountStatusType value) {
        this.accountStatus = value;
    }

}
