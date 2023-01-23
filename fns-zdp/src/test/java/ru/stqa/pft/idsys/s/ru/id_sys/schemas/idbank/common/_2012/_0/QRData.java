
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос данных QR кода и Merchant по qrcId
 * 
 * <p>Java class for QR_Data complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QR_Data">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="qrcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QR_Data", propOrder = {
    "qrcId"
})
public class QRData {

    @XmlElement(required = true)
    protected String qrcId;

    /**
     * Gets the value of the qrcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQrcId() {
        return qrcId;
    }

    /**
     * Sets the value of the qrcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQrcId(String value) {
        this.qrcId = value;
    }

}
