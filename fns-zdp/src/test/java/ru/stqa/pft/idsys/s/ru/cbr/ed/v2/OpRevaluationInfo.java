
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Дополнительная информация по операции.
 * 
 * <p>Java class for OpRevaluationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OpRevaluationInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OpPreciousMetal" type="{urn:cbr-ru:ed:v2.0}OpPreciousMetal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpRevaluationInfo", propOrder = {
    "opPreciousMetal"
})
public class OpRevaluationInfo {

    @XmlElement(name = "OpPreciousMetal", required = true)
    protected OpPreciousMetal opPreciousMetal;

    /**
     * Gets the value of the opPreciousMetal property.
     * 
     * @return
     *     possible object is
     *     {@link OpPreciousMetal }
     *     
     */
    public OpPreciousMetal getOpPreciousMetal() {
        return opPreciousMetal;
    }

    /**
     * Sets the value of the opPreciousMetal property.
     * 
     * @param value
     *     allowed object is
     *     {@link OpPreciousMetal }
     *     
     */
    public void setOpPreciousMetal(OpPreciousMetal value) {
        this.opPreciousMetal = value;
    }

}
