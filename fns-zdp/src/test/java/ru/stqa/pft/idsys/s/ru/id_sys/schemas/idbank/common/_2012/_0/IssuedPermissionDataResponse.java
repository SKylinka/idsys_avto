
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Ответ на Запрос перечня согласий пользователя ЕСИА
 * 
 * <p>Java class for IssuedPermissionDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedPermissionDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssuedPermission" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IssuedPermission" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedPermissionDataResponse", propOrder = {
    "status",
    "issuedPermission"
})
public class IssuedPermissionDataResponse {

    @XmlElement(required = true)
    protected String status;
    @XmlElement(name = "IssuedPermission")
    protected List<IssuedPermission> issuedPermission;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the issuedPermission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the issuedPermission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIssuedPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IssuedPermission }
     * 
     * 
     */
    public List<IssuedPermission> getIssuedPermission() {
        if (issuedPermission == null) {
            issuedPermission = new ArrayList<IssuedPermission>();
        }
        return this.issuedPermission;
    }

}
