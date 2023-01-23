
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос персональных данных пользователя ЕСИА
 * 
 * <p>Java class for ReceivePersonalDataResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReceivePersonalDataResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProofStatus" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PersonalDataEntry" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReceivePersonalDataResponse", propOrder = {
    "dataType",
    "proofStatus",
    "personalDataEntry",
    "required"
})
public class ReceivePersonalDataResponse {

    @XmlElement(required = true)
    protected String dataType;
    @XmlElement(name = "ProofStatus")
    protected List<String> proofStatus;
    @XmlElement(name = "PersonalDataEntry")
    protected java.lang.Object personalDataEntry;
    protected Boolean required;

    /**
     * Gets the value of the dataType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * Sets the value of the dataType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataType(String value) {
        this.dataType = value;
    }

    /**
     * Gets the value of the proofStatus property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the proofStatus property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProofStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getProofStatus() {
        if (proofStatus == null) {
            proofStatus = new ArrayList<String>();
        }
        return this.proofStatus;
    }

    /**
     * Gets the value of the personalDataEntry property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.Object }
     *     
     */
    public java.lang.Object getPersonalDataEntry() {
        return personalDataEntry;
    }

    /**
     * Sets the value of the personalDataEntry property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.Object }
     *     
     */
    public void setPersonalDataEntry(java.lang.Object value) {
        this.personalDataEntry = value;
    }

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequired() {
        return required;
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

}
