
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос регистрации ЮЛ
 * 
 * <p>Java class for Acc_Register complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Acc_Register">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UL_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Acc_Register", propOrder = {
    "ulId",
    "account"
})
public class AccRegister {

    @XmlElement(name = "UL_Id", required = true)
    protected String ulId;
    @XmlElement(name = "Account", required = true)
    protected String account;

    /**
     * Gets the value of the ulId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getULId() {
        return ulId;
    }

    /**
     * Sets the value of the ulId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setULId(String value) {
        this.ulId = value;
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

}
