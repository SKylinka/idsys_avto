
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Запрос статуса операций по QR-кодам
 * 
 * <p>Java class for QR_Status complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QR_Status">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Qr_id" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QR_Status", propOrder = {
    "qrId"
})
public class QRStatus {

    @XmlElement(name = "Qr_id", required = true)
    protected List<String> qrId;

    /**
     * Gets the value of the qrId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qrId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQrId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getQrId() {
        if (qrId == null) {
            qrId = new ArrayList<String>();
        }
        return this.qrId;
    }

}
