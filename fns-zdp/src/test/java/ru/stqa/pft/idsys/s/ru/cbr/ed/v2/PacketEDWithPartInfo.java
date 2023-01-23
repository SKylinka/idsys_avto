
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Комплексный тип для пакета электронных сообщений с информацией о части.
 * 
 * <p>Java class for PacketEDWithPartInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PacketEDWithPartInfo">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ED">
 *       &lt;sequence>
 *         &lt;element name="PartInfo" type="{urn:cbr-ru:ed:v2.0}PartInfo" minOccurs="0"/>
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
@XmlType(name = "PacketEDWithPartInfo", propOrder = {
    "partInfo",
    "initialED"
})
public class PacketEDWithPartInfo
    extends ED
{

    @XmlElement(name = "PartInfo")
    protected PartInfo partInfo;
    @XmlElement(name = "InitialED")
    protected EDRefID initialED;

    /**
     * Gets the value of the partInfo property.
     * 
     * @return
     *     possible object is
     *     {@link PartInfo }
     *     
     */
    public PartInfo getPartInfo() {
        return partInfo;
    }

    /**
     * Sets the value of the partInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartInfo }
     *     
     */
    public void setPartInfo(PartInfo value) {
        this.partInfo = value;
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
