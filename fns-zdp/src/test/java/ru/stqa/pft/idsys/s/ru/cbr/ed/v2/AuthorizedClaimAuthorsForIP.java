
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Authorized Claim Authors List For Indirect Participant.
 * 
 * <p>Java class for AuthorizedClaimAuthorsForIP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizedClaimAuthorsForIP">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizedClaimAuthorsListForIP" type="{urn:cbr-ru:ed:v2.0}AuthorizedClaimAuthorsListForIP" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizedClaimAuthorsForIP", propOrder = {
    "authorizedClaimAuthorsListForIP"
})
public class AuthorizedClaimAuthorsForIP {

    @XmlElement(name = "AuthorizedClaimAuthorsListForIP", required = true)
    protected List<AuthorizedClaimAuthorsListForIP> authorizedClaimAuthorsListForIP;

    /**
     * Gets the value of the authorizedClaimAuthorsListForIP property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedClaimAuthorsListForIP property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedClaimAuthorsListForIP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizedClaimAuthorsListForIP }
     * 
     * 
     */
    public List<AuthorizedClaimAuthorsListForIP> getAuthorizedClaimAuthorsListForIP() {
        if (authorizedClaimAuthorsListForIP == null) {
            authorizedClaimAuthorsListForIP = new ArrayList<AuthorizedClaimAuthorsListForIP>();
        }
        return this.authorizedClaimAuthorsListForIP;
    }

}
