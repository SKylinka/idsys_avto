
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * List of Accounts (and optionally Clearing Circuits).
 * 
 * <p>Java class for AuthClaimAuthorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthClaimAuthorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountsList" type="{urn:cbr-ru:ed:v2.0}BICAccCSListType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthClaimAuthorType", propOrder = {
    "accountsList"
})
public class AuthClaimAuthorType {

    @XmlElement(name = "AccountsList", required = true)
    protected List<BICAccCSListType> accountsList;

    /**
     * Gets the value of the accountsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accountsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccountsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICAccCSListType }
     * 
     * 
     */
    public List<BICAccCSListType> getAccountsList() {
        if (accountsList == null) {
            accountsList = new ArrayList<BICAccCSListType>();
        }
        return this.accountsList;
    }

}
