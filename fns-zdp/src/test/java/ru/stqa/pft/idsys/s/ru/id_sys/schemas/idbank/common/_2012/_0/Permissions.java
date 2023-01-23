
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Согласия ЕСИА
 * 
 * <p>Java class for Permissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Permissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ClaimPersonPermissions" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ClaimPersonPermissions"/>
 *         &lt;element name="IssuedPermissions" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IssuedPermissions"/>
 *         &lt;element name="ReceivePersonalData" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ReceivePersonalData"/>
 *         &lt;element name="PermissionNotification" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}PermissionNotification"/>
 *         &lt;element name="DataChange" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}DataChange"/>
 *         &lt;element name="IssuedPermissionDataResponse" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IssuedPermissionDataResponse"/>
 *         &lt;element name="ReceivePersonalDataResponse" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}ReceivePersonalDataResponse"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Permissions", propOrder = {
    "claimPersonPermissions",
    "issuedPermissions",
    "receivePersonalData",
    "permissionNotification",
    "dataChange",
    "issuedPermissionDataResponse",
    "receivePersonalDataResponse"
})
public class Permissions {

    @XmlElement(name = "ClaimPersonPermissions")
    protected ClaimPersonPermissions claimPersonPermissions;
    @XmlElement(name = "IssuedPermissions")
    protected IssuedPermissions issuedPermissions;
    @XmlElement(name = "ReceivePersonalData")
    protected ReceivePersonalData receivePersonalData;
    @XmlElement(name = "PermissionNotification")
    protected PermissionNotification permissionNotification;
    @XmlElement(name = "DataChange")
    protected DataChange dataChange;
    @XmlElement(name = "IssuedPermissionDataResponse")
    protected IssuedPermissionDataResponse issuedPermissionDataResponse;
    @XmlElement(name = "ReceivePersonalDataResponse")
    protected ReceivePersonalDataResponse receivePersonalDataResponse;

    /**
     * Gets the value of the claimPersonPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimPersonPermissions }
     *     
     */
    public ClaimPersonPermissions getClaimPersonPermissions() {
        return claimPersonPermissions;
    }

    /**
     * Sets the value of the claimPersonPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimPersonPermissions }
     *     
     */
    public void setClaimPersonPermissions(ClaimPersonPermissions value) {
        this.claimPersonPermissions = value;
    }

    /**
     * Gets the value of the issuedPermissions property.
     * 
     * @return
     *     possible object is
     *     {@link IssuedPermissions }
     *     
     */
    public IssuedPermissions getIssuedPermissions() {
        return issuedPermissions;
    }

    /**
     * Sets the value of the issuedPermissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuedPermissions }
     *     
     */
    public void setIssuedPermissions(IssuedPermissions value) {
        this.issuedPermissions = value;
    }

    /**
     * Gets the value of the receivePersonalData property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivePersonalData }
     *     
     */
    public ReceivePersonalData getReceivePersonalData() {
        return receivePersonalData;
    }

    /**
     * Sets the value of the receivePersonalData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivePersonalData }
     *     
     */
    public void setReceivePersonalData(ReceivePersonalData value) {
        this.receivePersonalData = value;
    }

    /**
     * Gets the value of the permissionNotification property.
     * 
     * @return
     *     possible object is
     *     {@link PermissionNotification }
     *     
     */
    public PermissionNotification getPermissionNotification() {
        return permissionNotification;
    }

    /**
     * Sets the value of the permissionNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermissionNotification }
     *     
     */
    public void setPermissionNotification(PermissionNotification value) {
        this.permissionNotification = value;
    }

    /**
     * Gets the value of the dataChange property.
     * 
     * @return
     *     possible object is
     *     {@link DataChange }
     *     
     */
    public DataChange getDataChange() {
        return dataChange;
    }

    /**
     * Sets the value of the dataChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataChange }
     *     
     */
    public void setDataChange(DataChange value) {
        this.dataChange = value;
    }

    /**
     * Gets the value of the issuedPermissionDataResponse property.
     * 
     * @return
     *     possible object is
     *     {@link IssuedPermissionDataResponse }
     *     
     */
    public IssuedPermissionDataResponse getIssuedPermissionDataResponse() {
        return issuedPermissionDataResponse;
    }

    /**
     * Sets the value of the issuedPermissionDataResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuedPermissionDataResponse }
     *     
     */
    public void setIssuedPermissionDataResponse(IssuedPermissionDataResponse value) {
        this.issuedPermissionDataResponse = value;
    }

    /**
     * Gets the value of the receivePersonalDataResponse property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivePersonalDataResponse }
     *     
     */
    public ReceivePersonalDataResponse getReceivePersonalDataResponse() {
        return receivePersonalDataResponse;
    }

    /**
     * Sets the value of the receivePersonalDataResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivePersonalDataResponse }
     *     
     */
    public void setReceivePersonalDataResponse(ReceivePersonalDataResponse value) {
        this.receivePersonalDataResponse = value;
    }

}
