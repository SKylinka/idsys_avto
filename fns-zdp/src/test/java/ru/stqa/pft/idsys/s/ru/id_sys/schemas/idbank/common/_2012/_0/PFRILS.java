
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Сведения о состоянии ИЛС
 * 
 * <p>Java class for PFR_ILS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PFR_ILS">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IlsFile" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}BinaryResult" maxOccurs="2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PFR_ILS", propOrder = {
    "ilsFile"
})
public class PFRILS {

    @XmlElement(name = "IlsFile", required = true)
    protected List<BinaryResult> ilsFile;

    /**
     * Gets the value of the ilsFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ilsFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIlsFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryResult }
     * 
     * 
     */
    public List<BinaryResult> getIlsFile() {
        if (ilsFile == null) {
            ilsFile = new ArrayList<BinaryResult>();
        }
        return this.ilsFile;
    }

}
