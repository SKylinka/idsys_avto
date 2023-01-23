
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Документ, удостоверяющий личность
 * 
 * <p>Java class for PrivatePersonDocumentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PrivatePersonDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}PrivatePersonDocumentCodeType"/>
 *         &lt;element name="Name" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-255Type"/>
 *         &lt;element name="SeriesNumber" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}String1-25Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PrivatePersonDocumentType", propOrder = {
    "code",
    "name",
    "seriesNumber"
})
public class PrivatePersonDocumentType {

    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "Name", required = true)
    protected String name;
    @XmlElement(name = "SeriesNumber", required = true)
    protected String seriesNumber;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the seriesNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesNumber() {
        return seriesNumber;
    }

    /**
     * Sets the value of the seriesNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesNumber(String value) {
        this.seriesNumber = value;
    }

}
