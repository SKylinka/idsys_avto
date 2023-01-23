
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос согласия пользователя
 * 
 * <p>Java class for ClaimPersonPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClaimPersonPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OGRN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="personOid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType" minOccurs="0"/>
 *         &lt;element name="Identification" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IdentificationEx" minOccurs="0"/>
 *         &lt;element name="Permission" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Permission" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClaimPersonPermissions", propOrder = {
    "ogrn",
    "personOid",
    "snils",
    "fio",
    "identification",
    "permission"
})
public class ClaimPersonPermissions {

    @XmlElement(name = "OGRN", required = true)
    protected String ogrn;
    protected String personOid;
    protected String snils;
    @XmlElement(name = "FIO")
    protected FioType fio;
    @XmlElement(name = "Identification")
    protected IdentificationEx identification;
    @XmlElement(name = "Permission", required = true)
    protected List<Permission> permission;

    /**
     * Gets the value of the ogrn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOGRN() {
        return ogrn;
    }

    /**
     * Sets the value of the ogrn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOGRN(String value) {
        this.ogrn = value;
    }

    /**
     * Gets the value of the personOid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonOid() {
        return personOid;
    }

    /**
     * Sets the value of the personOid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonOid(String value) {
        this.personOid = value;
    }

    /**
     * Gets the value of the snils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSnils() {
        return snils;
    }

    /**
     * Sets the value of the snils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSnils(String value) {
        this.snils = value;
    }

    /**
     * Gets the value of the fio property.
     * 
     * @return
     *     possible object is
     *     {@link FioType }
     *     
     */
    public FioType getFIO() {
        return fio;
    }

    /**
     * Sets the value of the fio property.
     * 
     * @param value
     *     allowed object is
     *     {@link FioType }
     *     
     */
    public void setFIO(FioType value) {
        this.fio = value;
    }

    /**
     * Gets the value of the identification property.
     * 
     * @return
     *     possible object is
     *     {@link IdentificationEx }
     *     
     */
    public IdentificationEx getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentificationEx }
     *     
     */
    public void setIdentification(IdentificationEx value) {
        this.identification = value;
    }

    /**
     * Gets the value of the permission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the permission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPermission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Permission }
     * 
     * 
     */
    public List<Permission> getPermission() {
        if (permission == null) {
            permission = new ArrayList<Permission>();
        }
        return this.permission;
    }

}
