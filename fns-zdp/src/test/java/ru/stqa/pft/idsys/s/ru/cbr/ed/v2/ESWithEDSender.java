
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Комплексный тип для электронных сообщений. Содержит реквизит EDSender.
 * 
 * <p>Java class for ESWithEDSender complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESWithEDSender">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ESWithMandatoryEDReceiver">
 *       &lt;attribute name="EDSender" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}EDDrawerIDType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESWithEDSender")
public class ESWithEDSender
    extends ESWithMandatoryEDReceiver
{

    @XmlAttribute(name = "EDSender", required = true)
    protected String edSender;

    /**
     * Gets the value of the edSender property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEDSender() {
        return edSender;
    }

    /**
     * Sets the value of the edSender property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEDSender(String value) {
        this.edSender = value;
    }

}
