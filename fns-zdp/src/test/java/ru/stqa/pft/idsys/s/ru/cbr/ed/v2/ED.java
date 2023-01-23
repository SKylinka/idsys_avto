
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.cbr.dsig.v1.SigValueType;


/**
 * Базовый комплексный тип для всех электронных сообщений данного пространства имен
 * 
 * <p>Java class for ED complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ED">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}EDRefID">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element ref="{urn:cbr-ru:dsig:v1.1}SigValue" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ED", propOrder = {
    "sigValue"
})
@XmlSeeAlso({
    PacketEDWithPartInfo.class,
    EDWithDeclaration.class,
    ESID.class,
    ESWithMandatoryEDReceiver.class,
    EPDComplete.class
})
public class ED
    extends EDRefID
{

    @XmlElement(name = "SigValue", namespace = "urn:cbr-ru:dsig:v1.1")
    protected SigValueType sigValue;

    /**
     * Gets the value of the sigValue property.
     * 
     * @return
     *     possible object is
     *     {@link SigValueType }
     *     
     */
    public SigValueType getSigValue() {
        return sigValue;
    }

    /**
     * Sets the value of the sigValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link SigValueType }
     *     
     */
    public void setSigValue(SigValueType value) {
        this.sigValue = value;
    }

}
