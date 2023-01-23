
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import ru.id_sys.schemas.idbank.cik._2017._0.Персона;
import ru.id_sys.schemas.idbank.esia._2015._0.AuthorityRequest;
import ru.id_sys.schemas.idbank.esia._2015._0.RegisterNBPType;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.notary._2014._1.PledgeNotificationSigned;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.notary._2014._1.RegistrationCertificateSigned;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.thirdpartyorderservice._2015._0.GosLimit;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.thirdpartyorderservice._2015._0.GosServ;


/**
 * Документ
 * 
 * <p>Java class for CommonDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommonDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *       &lt;choice>
 *         &lt;element name="Charge" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Charge"/>
 *         &lt;element name="PledgeNotification" type="{http://www.id-sys.ru/schemas/idbank/notary/2014/1.00/}PledgeNotificationSigned"/>
 *         &lt;element name="RegistrationCertificate" type="{http://www.id-sys.ru/schemas/idbank/notary/2014/1.00/}RegistrationCertificateSigned"/>
 *         &lt;element name="Register" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}AuthorityRequest"/>
 *         &lt;element name="Recover" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}AuthorityRequest"/>
 *         &lt;element name="DeleteEsiaAcc" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}AuthorityRequest"/>
 *         &lt;element name="Confirm" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}AuthorityRequest"/>
 *         &lt;element name="GosServ" type="{http://www.id-sys.ru/schemas/idbank/ThirdPartyOrderService/2015/0.01/}GosServ"/>
 *         &lt;element name="GosLimit" type="{http://www.id-sys.ru/schemas/idbank/ThirdPartyOrderService/2015/0.01/}GosLimit"/>
 *         &lt;element name="RegisterNBP" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}RegisterNBPType"/>
 *         &lt;element name="Персона" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Персона"/>
 *         &lt;element name="RegisterBySimplified" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}AuthorityRequest"/>
 *         &lt;element name="ChangeEsiaAcc" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}AuthorityRequest"/>
 *         &lt;element name="PFR_ILS" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}PFR_ILS"/>
 *         &lt;element name="SBP" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}SBP"/>
 *         &lt;element name="Permissions" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Permissions"/>
 *         &lt;element name="BinaryDocument" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *                 &lt;sequence>
 *                   &lt;element name="BLOB" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *       &lt;attribute name="customerID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommonDocument", propOrder = {
    "charge",
    "pledgeNotification",
    "registrationCertificate",
    "register",
    "recover",
    "deleteEsiaAcc",
    "confirm",
    "gosServ",
    "gosLimit",
    "registerNBP",
    "\u043f\u0435\u0440\u0441\u043e\u043d\u0430",
    "registerBySimplified",
    "changeEsiaAcc",
    "pfrils",
    "sbp",
    "permissions",
    "binaryDocument"
})
public class CommonDocument
    extends java.lang.Object
{

    @XmlElement(name = "Charge")
    protected Charge charge;
    @XmlElement(name = "PledgeNotification")
    protected PledgeNotificationSigned pledgeNotification;
    @XmlElement(name = "RegistrationCertificate")
    protected RegistrationCertificateSigned registrationCertificate;
    @XmlElement(name = "Register")
    protected AuthorityRequest register;
    @XmlElement(name = "Recover")
    protected AuthorityRequest recover;
    @XmlElement(name = "DeleteEsiaAcc")
    protected AuthorityRequest deleteEsiaAcc;
    @XmlElement(name = "Confirm")
    protected AuthorityRequest confirm;
    @XmlElement(name = "GosServ")
    protected GosServ gosServ;
    @XmlElement(name = "GosLimit")
    protected GosLimit gosLimit;
    @XmlElement(name = "RegisterNBP")
    protected RegisterNBPType registerNBP;
    @XmlElement(name = "\u041f\u0435\u0440\u0441\u043e\u043d\u0430")
    protected Персона персона;
    @XmlElement(name = "RegisterBySimplified")
    protected AuthorityRequest registerBySimplified;
    @XmlElement(name = "ChangeEsiaAcc")
    protected AuthorityRequest changeEsiaAcc;
    @XmlElement(name = "PFR_ILS")
    protected PFRILS pfrils;
    @XmlElement(name = "SBP")
    protected SBP sbp;
    @XmlElement(name = "Permissions")
    protected Permissions permissions;
    @XmlElement(name = "BinaryDocument")
    protected List<CommonDocument.BinaryDocument> binaryDocument;
    @XmlAttribute(name = "customerID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String customerID;

    /**
     * Gets the value of the charge property.
     * 
     * @return
     *     possible object is
     *     {@link Charge }
     *     
     */
    public Charge getCharge() {
        return charge;
    }

    /**
     * Sets the value of the charge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge }
     *     
     */
    public void setCharge(Charge value) {
        this.charge = value;
    }

    /**
     * Gets the value of the pledgeNotification property.
     * 
     * @return
     *     possible object is
     *     {@link PledgeNotificationSigned }
     *     
     */
    public PledgeNotificationSigned getPledgeNotification() {
        return pledgeNotification;
    }

    /**
     * Sets the value of the pledgeNotification property.
     * 
     * @param value
     *     allowed object is
     *     {@link PledgeNotificationSigned }
     *     
     */
    public void setPledgeNotification(PledgeNotificationSigned value) {
        this.pledgeNotification = value;
    }

    /**
     * Gets the value of the registrationCertificate property.
     * 
     * @return
     *     possible object is
     *     {@link RegistrationCertificateSigned }
     *     
     */
    public RegistrationCertificateSigned getRegistrationCertificate() {
        return registrationCertificate;
    }

    /**
     * Sets the value of the registrationCertificate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistrationCertificateSigned }
     *     
     */
    public void setRegistrationCertificate(RegistrationCertificateSigned value) {
        this.registrationCertificate = value;
    }

    /**
     * Gets the value of the register property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequest }
     *     
     */
    public AuthorityRequest getRegister() {
        return register;
    }

    /**
     * Sets the value of the register property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequest }
     *     
     */
    public void setRegister(AuthorityRequest value) {
        this.register = value;
    }

    /**
     * Gets the value of the recover property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequest }
     *     
     */
    public AuthorityRequest getRecover() {
        return recover;
    }

    /**
     * Sets the value of the recover property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequest }
     *     
     */
    public void setRecover(AuthorityRequest value) {
        this.recover = value;
    }

    /**
     * Gets the value of the deleteEsiaAcc property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequest }
     *     
     */
    public AuthorityRequest getDeleteEsiaAcc() {
        return deleteEsiaAcc;
    }

    /**
     * Sets the value of the deleteEsiaAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequest }
     *     
     */
    public void setDeleteEsiaAcc(AuthorityRequest value) {
        this.deleteEsiaAcc = value;
    }

    /**
     * Gets the value of the confirm property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequest }
     *     
     */
    public AuthorityRequest getConfirm() {
        return confirm;
    }

    /**
     * Sets the value of the confirm property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequest }
     *     
     */
    public void setConfirm(AuthorityRequest value) {
        this.confirm = value;
    }

    /**
     * Gets the value of the gosServ property.
     * 
     * @return
     *     possible object is
     *     {@link GosServ }
     *     
     */
    public GosServ getGosServ() {
        return gosServ;
    }

    /**
     * Sets the value of the gosServ property.
     * 
     * @param value
     *     allowed object is
     *     {@link GosServ }
     *     
     */
    public void setGosServ(GosServ value) {
        this.gosServ = value;
    }

    /**
     * Gets the value of the gosLimit property.
     * 
     * @return
     *     possible object is
     *     {@link GosLimit }
     *     
     */
    public GosLimit getGosLimit() {
        return gosLimit;
    }

    /**
     * Sets the value of the gosLimit property.
     * 
     * @param value
     *     allowed object is
     *     {@link GosLimit }
     *     
     */
    public void setGosLimit(GosLimit value) {
        this.gosLimit = value;
    }

    /**
     * Gets the value of the registerNBP property.
     * 
     * @return
     *     possible object is
     *     {@link RegisterNBPType }
     *     
     */
    public RegisterNBPType getRegisterNBP() {
        return registerNBP;
    }

    /**
     * Sets the value of the registerNBP property.
     * 
     * @param value
     *     allowed object is
     *     {@link RegisterNBPType }
     *     
     */
    public void setRegisterNBP(RegisterNBPType value) {
        this.registerNBP = value;
    }

    /**
     * Gets the value of the персона property.
     * 
     * @return
     *     possible object is
     *     {@link Персона }
     *     
     */
    public Персона getПерсона() {
        return персона;
    }

    /**
     * Sets the value of the персона property.
     * 
     * @param value
     *     allowed object is
     *     {@link Персона }
     *     
     */
    public void setПерсона(Персона value) {
        this.персона = value;
    }

    /**
     * Gets the value of the registerBySimplified property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequest }
     *     
     */
    public AuthorityRequest getRegisterBySimplified() {
        return registerBySimplified;
    }

    /**
     * Sets the value of the registerBySimplified property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequest }
     *     
     */
    public void setRegisterBySimplified(AuthorityRequest value) {
        this.registerBySimplified = value;
    }

    /**
     * Gets the value of the changeEsiaAcc property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorityRequest }
     *     
     */
    public AuthorityRequest getChangeEsiaAcc() {
        return changeEsiaAcc;
    }

    /**
     * Sets the value of the changeEsiaAcc property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorityRequest }
     *     
     */
    public void setChangeEsiaAcc(AuthorityRequest value) {
        this.changeEsiaAcc = value;
    }

    /**
     * Gets the value of the pfrils property.
     * 
     * @return
     *     possible object is
     *     {@link PFRILS }
     *     
     */
    public PFRILS getPFRILS() {
        return pfrils;
    }

    /**
     * Sets the value of the pfrils property.
     * 
     * @param value
     *     allowed object is
     *     {@link PFRILS }
     *     
     */
    public void setPFRILS(PFRILS value) {
        this.pfrils = value;
    }

    /**
     * Gets the value of the sbp property.
     * 
     * @return
     *     possible object is
     *     {@link SBP }
     *     
     */
    public SBP getSBP() {
        return sbp;
    }

    /**
     * Sets the value of the sbp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SBP }
     *     
     */
    public void setSBP(SBP value) {
        this.sbp = value;
    }

    /**
     * Gets the value of the permissions property.
     * 
     * @return
     *     possible object is
     *     {@link Permissions }
     *     
     */
    public Permissions getPermissions() {
        return permissions;
    }

    /**
     * Sets the value of the permissions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Permissions }
     *     
     */
    public void setPermissions(Permissions value) {
        this.permissions = value;
    }

    /**
     * Gets the value of the binaryDocument property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the binaryDocument property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBinaryDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CommonDocument.BinaryDocument }
     * 
     * 
     */
    public List<CommonDocument.BinaryDocument> getBinaryDocument() {
        if (binaryDocument == null) {
            binaryDocument = new ArrayList<CommonDocument.BinaryDocument>();
        }
        return this.binaryDocument;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
     *       &lt;sequence>
     *         &lt;element name="BLOB" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "blob"
    })
    public static class BinaryDocument
        extends java.lang.Object
    {

        @XmlElement(name = "BLOB", required = true)
        protected byte[] blob;

        /**
         * Gets the value of the blob property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getBLOB() {
            return blob;
        }

        /**
         * Sets the value of the blob property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setBLOB(byte[] value) {
            this.blob = value;
        }

    }

}
