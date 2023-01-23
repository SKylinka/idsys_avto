
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about registry items about accepted for execution FTI's.
 * 
 * <p>Java class for EDReestrInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDReestrInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EDReestrFieldList" type="{urn:cbr-ru:ed:v2.0}FieldInfo" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TransactionID" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}Max5OrdinalNumberType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDReestrInfo", propOrder = {
    "edReestrFieldList"
})
public class EDReestrInfo {

    @XmlElement(name = "EDReestrFieldList")
    protected List<FieldInfo> edReestrFieldList;
    @XmlAttribute(name = "TransactionID", required = true)
    protected BigInteger transactionID;

    /**
     * Gets the value of the edReestrFieldList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the edReestrFieldList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEDReestrFieldList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FieldInfo }
     * 
     * 
     */
    public List<FieldInfo> getEDReestrFieldList() {
        if (edReestrFieldList == null) {
            edReestrFieldList = new ArrayList<FieldInfo>();
        }
        return this.edReestrFieldList;
    }

    /**
     * Gets the value of the transactionID property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTransactionID() {
        return transactionID;
    }

    /**
     * Sets the value of the transactionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTransactionID(BigInteger value) {
        this.transactionID = value;
    }

}
