
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос данных ТСП
 * 
 * <p>Java class for TSP_Info complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TSP_Info">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TSP_Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSP_Info", propOrder = {
    "tspId"
})
public class TSPInfo {

    @XmlElement(name = "TSP_Id", required = true)
    protected String tspId;

    /**
     * Gets the value of the tspId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTSPId() {
        return tspId;
    }

    /**
     * Sets the value of the tspId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTSPId(String value) {
        this.tspId = value;
    }

}
