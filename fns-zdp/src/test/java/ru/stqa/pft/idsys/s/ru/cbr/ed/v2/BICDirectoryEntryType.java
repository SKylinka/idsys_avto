
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.ed.leaftypes.v2.ChangeType;


/**
 * BIC Directory Entry.
 * 
 * <p>Java class for BICDirectoryEntryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BICDirectoryEntryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantInfo" type="{urn:cbr-ru:ed:v2.0}ParticipantInfoType"/>
 *         &lt;element name="SWBICS" type="{urn:cbr-ru:ed:v2.0}SWBICList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{urn:cbr-ru:ed:v2.0}AccountsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BIC" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="ChangeType" type="{urn:cbr-ru:ed:leaftypes:v2.0}ChangeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BICDirectoryEntryType", propOrder = {
    "participantInfo",
    "swbics",
    "accounts"
})
public class BICDirectoryEntryType {

    @XmlElement(name = "ParticipantInfo", required = true)
    protected ParticipantInfoType participantInfo;
    @XmlElement(name = "SWBICS")
    protected List<SWBICList> swbics;
    @XmlElement(name = "Accounts")
    protected List<AccountsType> accounts;
    @XmlAttribute(name = "BIC", required = true)
    protected String bic;
    @XmlAttribute(name = "ChangeType")
    protected ChangeType changeType;

    /**
     * Gets the value of the participantInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantInfoType }
     *     
     */
    public ParticipantInfoType getParticipantInfo() {
        return participantInfo;
    }

    /**
     * Sets the value of the participantInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantInfoType }
     *     
     */
    public void setParticipantInfo(ParticipantInfoType value) {
        this.participantInfo = value;
    }

    /**
     * Gets the value of the swbics property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the swbics property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSWBICS().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SWBICList }
     * 
     * 
     */
    public List<SWBICList> getSWBICS() {
        if (swbics == null) {
            swbics = new ArrayList<SWBICList>();
        }
        return this.swbics;
    }

    /**
     * Gets the value of the accounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountsType }
     * 
     * 
     */
    public List<AccountsType> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<AccountsType>();
        }
        return this.accounts;
    }

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
     * Gets the value of the changeType property.
     * 
     * @return
     *     possible object is
     *     {@link ChangeType }
     *     
     */
    public ChangeType getChangeType() {
        return changeType;
    }

    /**
     * Sets the value of the changeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChangeType }
     *     
     */
    public void setChangeType(ChangeType value) {
        this.changeType = value;
    }

}
