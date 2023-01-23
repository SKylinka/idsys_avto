
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Authorized Claim Authors List.
 * 
 * <p>Java class for AuthorizedClaimAuthors complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizedClaimAuthors">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizedClaimAuthorsList" type="{urn:cbr-ru:ed:v2.0}AuthorizedClaimAuthorsList" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizedClaimAuthors", propOrder = {
    "authorizedClaimAuthorsList"
})
public class AuthorizedClaimAuthors {

    @XmlElement(name = "AuthorizedClaimAuthorsList", required = true)
    protected List<AuthorizedClaimAuthorsList> authorizedClaimAuthorsList;

    /**
     * Gets the value of the authorizedClaimAuthorsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizedClaimAuthorsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizedClaimAuthorsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorizedClaimAuthorsList }
     * 
     * 
     */
    public List<AuthorizedClaimAuthorsList> getAuthorizedClaimAuthorsList() {
        if (authorizedClaimAuthorsList == null) {
            authorizedClaimAuthorsList = new ArrayList<AuthorizedClaimAuthorsList>();
        }
        return this.authorizedClaimAuthorsList;
    }

}
