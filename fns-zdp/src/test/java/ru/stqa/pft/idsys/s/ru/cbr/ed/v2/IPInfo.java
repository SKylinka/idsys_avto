
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indirect Participant Info.
 * 
 * <p>Java class for IPInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IPInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="BICList" type="{urn:cbr-ru:ed:v2.0}IPListType"/>
 *           &lt;element name="DirectParticipant" type="{urn:cbr-ru:ed:v2.0}MainPoolParticipant"/>
 *         &lt;/choice>
 *         &lt;element name="SWBICS" type="{urn:cbr-ru:ed:v2.0}SWBICList" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{urn:cbr-ru:ed:v2.0}AccountsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IPInfo", propOrder = {
    "bicList",
    "directParticipant",
    "swbics",
    "accounts"
})
public class IPInfo {

    @XmlElement(name = "BICList")
    protected IPListType bicList;
    @XmlElement(name = "DirectParticipant")
    protected MainPoolParticipant directParticipant;
    @XmlElement(name = "SWBICS")
    protected List<SWBICList> swbics;
    @XmlElement(name = "Accounts")
    protected List<AccountsType> accounts;

    /**
     * Gets the value of the bicList property.
     * 
     * @return
     *     possible object is
     *     {@link IPListType }
     *     
     */
    public IPListType getBICList() {
        return bicList;
    }

    /**
     * Sets the value of the bicList property.
     * 
     * @param value
     *     allowed object is
     *     {@link IPListType }
     *     
     */
    public void setBICList(IPListType value) {
        this.bicList = value;
    }

    /**
     * Gets the value of the directParticipant property.
     * 
     * @return
     *     possible object is
     *     {@link MainPoolParticipant }
     *     
     */
    public MainPoolParticipant getDirectParticipant() {
        return directParticipant;
    }

    /**
     * Sets the value of the directParticipant property.
     * 
     * @param value
     *     allowed object is
     *     {@link MainPoolParticipant }
     *     
     */
    public void setDirectParticipant(MainPoolParticipant value) {
        this.directParticipant = value;
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

}
