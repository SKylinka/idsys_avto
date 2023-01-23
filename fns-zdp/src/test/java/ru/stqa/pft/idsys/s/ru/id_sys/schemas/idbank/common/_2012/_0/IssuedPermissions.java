
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * «апрос перечн€ согласий пользовател€
 * 
 * <p>Java class for IssuedPermissions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuedPermissions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IssuedPermissionsStatus" minOccurs="0"/>
 *         &lt;element name="snils" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FIO" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}FioType"/>
 *         &lt;element name="Identification" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}IdentificationEx" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuedPermissions", propOrder = {
    "status",
    "snils",
    "fio",
    "identification"
})
public class IssuedPermissions {

    protected Integer status;
    protected String snils;
    @XmlElement(name = "FIO", required = true)
    protected FioType fio;
    @XmlElement(name = "Identification")
    protected IdentificationEx identification;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setStatus(Integer value) {
        this.status = value;
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

}
