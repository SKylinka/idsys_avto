
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * ����� ��������� ��������-��������������� ������ ��� ���
 * 
 * <p>Java class for ESIDResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ESIDResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ESID">
 *       &lt;sequence>
 *         &lt;element name="InitialEDInfo" type="{urn:cbr-ru:ed:v2.0}InitialEDInfo" minOccurs="0"/>
 *         &lt;element name="InitialED" type="{urn:cbr-ru:ed:v2.0}EDRefID" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ESIDResponse", propOrder = {
    "initialEDInfo",
    "initialED"
})
public class ESIDResponse
    extends ESID
{

    @XmlElement(name = "InitialEDInfo")
    protected InitialEDInfo initialEDInfo;
    @XmlElement(name = "InitialED")
    protected EDRefID initialED;

    /**
     * Gets the value of the initialEDInfo property.
     * 
     * @return
     *     possible object is
     *     {@link InitialEDInfo }
     *     
     */
    public InitialEDInfo getInitialEDInfo() {
        return initialEDInfo;
    }

    /**
     * Sets the value of the initialEDInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link InitialEDInfo }
     *     
     */
    public void setInitialEDInfo(InitialEDInfo value) {
        this.initialEDInfo = value;
    }

    /**
     * Gets the value of the initialED property.
     * 
     * @return
     *     possible object is
     *     {@link EDRefID }
     *     
     */
    public EDRefID getInitialED() {
        return initialED;
    }

    /**
     * Sets the value of the initialED property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDRefID }
     *     
     */
    public void setInitialED(EDRefID value) {
        this.initialED = value;
    }

}
