
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Participant's Private Profile.
 * 
 * <p>Java class for ParticipantProfileType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ParticipantProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipantProfileInfo" type="{urn:cbr-ru:ed:v2.0}ParticipantProfileInfoType"/>
 *         &lt;element name="AccountsInfo" type="{urn:cbr-ru:ed:v2.0}AccountsInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParticipantProfileType", propOrder = {
    "participantProfileInfo",
    "accountsInfo"
})
public class ParticipantProfileType {

    @XmlElement(name = "ParticipantProfileInfo", required = true)
    protected ParticipantProfileInfoType participantProfileInfo;
    @XmlElement(name = "AccountsInfo")
    protected List<AccountsInfoType> accountsInfo;

    /**
     * Gets the value of the participantProfileInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ParticipantProfileInfoType }
     *     
     */
    public ParticipantProfileInfoType getParticipantProfileInfo() {
        return participantProfileInfo;
    }

    /**
     * Sets the value of the participantProfileInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParticipantProfileInfoType }
     *     
     */
    public void setParticipantProfileInfo(ParticipantProfileInfoType value) {
        this.participantProfileInfo = value;
    }

    /**
     * Gets the value of the accountsInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountsInfoType }
     * 
     * 
     */
    public List<AccountsInfoType> getAccountsInfo() {
        if (accountsInfo == null) {
            accountsInfo = new ArrayList<AccountsInfoType>();
        }
        return this.accountsInfo;
    }

}
