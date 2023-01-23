
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о косвенном участнике.
 * 
 * <p>Java class for IndirectParticipantInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndirectParticipantInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IPBICPayer" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="IPBICPayee" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirectParticipantInfoType")
public class IndirectParticipantInfoType {

    @XmlAttribute(name = "IPBICPayer")
    protected String ipbicPayer;
    @XmlAttribute(name = "IPBICPayee")
    protected String ipbicPayee;

    /**
     * Gets the value of the ipbicPayer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPBICPayer() {
        return ipbicPayer;
    }

    /**
     * Sets the value of the ipbicPayer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPBICPayer(String value) {
        this.ipbicPayer = value;
    }

    /**
     * Gets the value of the ipbicPayee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIPBICPayee() {
        return ipbicPayee;
    }

    /**
     * Sets the value of the ipbicPayee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIPBICPayee(String value) {
        this.ipbicPayee = value;
    }

}
