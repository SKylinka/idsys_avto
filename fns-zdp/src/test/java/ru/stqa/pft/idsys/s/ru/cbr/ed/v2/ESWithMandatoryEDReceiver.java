
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Комплексный тип для электронных сообщений. Содержит обязательный реквизит EDReceiver.
 * 
 * <p>Java class for ESWithMandatoryEDReceiver complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESWithMandatoryEDReceiver">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ED">
 *       &lt;attribute name="EDReceiver" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESWithMandatoryEDReceiver")
@XmlSeeAlso({
    ESWithEDSender.class
})
public class ESWithMandatoryEDReceiver
    extends ED
{

    @XmlAttribute(name = "EDReceiver", required = true)
    protected String edReceiver;

    /**
     * Gets the value of the edReceiver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDReceiver() {
        return edReceiver;
    }

    /**
     * Sets the value of the edReceiver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDReceiver(String value) {
        this.edReceiver = value;
    }

}
