
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Информация о косвенном участнике.
 * 
 * <p>Java class for IndirectParticipantInfoAgType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndirectParticipantInfoAgType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="IPBICPayer" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="IPBICPayee" type="{urn:cbr-ru:ed:leaftypes:v2.0}BICRUIDType" />
 *       &lt;attribute name="AggrementID" type="{urn:cbr-ru:ed:leaftypes:v2.0}TwoDigitIdentifierType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndirectParticipantInfoAgType")
public class IndirectParticipantInfoAgType {

    @XmlAttribute(name = "IPBICPayer")
    protected String ipbicPayer;
    @XmlAttribute(name = "IPBICPayee")
    protected String ipbicPayee;
    @XmlAttribute(name = "AggrementID")
    protected String aggrementID;

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

    /**
     * Gets the value of the aggrementID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggrementID() {
        return aggrementID;
    }

    /**
     * Sets the value of the aggrementID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggrementID(String value) {
        this.aggrementID = value;
    }

}
