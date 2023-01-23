
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.esia._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип пакета запросов регистрации биометрических данных
 * 
 * <p>Java class for RegisterNBPType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegisterNBPType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatorSnils">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="50"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="BiometricDataRequest" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}BiometricDataRequestType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegisterNBPType", propOrder = {
    "operatorSnils",
    "biometricDataRequest"
})
public class RegisterNBPType {

    @XmlElement(name = "OperatorSnils", required = true)
    protected String operatorSnils;
    @XmlElement(name = "BiometricDataRequest", required = true)
    protected List<BiometricDataRequestType> biometricDataRequest;

    /**
     * Gets the value of the operatorSnils property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorSnils() {
        return operatorSnils;
    }

    /**
     * Sets the value of the operatorSnils property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorSnils(String value) {
        this.operatorSnils = value;
    }

    /**
     * Gets the value of the biometricDataRequest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biometricDataRequest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiometricDataRequest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiometricDataRequestType }
     * 
     * 
     */
    public List<BiometricDataRequestType> getBiometricDataRequest() {
        if (biometricDataRequest == null) {
            biometricDataRequest = new ArrayList<BiometricDataRequestType>();
        }
        return this.biometricDataRequest;
    }

}
