
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Движимое имущество, переданное в залог (2 вида - транспортное средство+прочее)
 * 
 * <p>Java class for PersonalPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonalPropertyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="VehicleProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}VehiclePropertyType"/>
 *         &lt;element name="OtherProperty" type="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}OtherPropertyType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalPropertyType", propOrder = {
    "vehicleProperty",
    "otherProperty"
})
public class PersonalPropertyType {

    @XmlElement(name = "VehicleProperty")
    protected VehiclePropertyType vehicleProperty;
    @XmlElement(name = "OtherProperty")
    protected OtherPropertyType otherProperty;

    /**
     * Gets the value of the vehicleProperty property.
     * 
     * @return
     *     possible object is
     *     {@link VehiclePropertyType }
     *     
     */
    public VehiclePropertyType getVehicleProperty() {
        return vehicleProperty;
    }

    /**
     * Sets the value of the vehicleProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link VehiclePropertyType }
     *     
     */
    public void setVehicleProperty(VehiclePropertyType value) {
        this.vehicleProperty = value;
    }

    /**
     * Gets the value of the otherProperty property.
     * 
     * @return
     *     possible object is
     *     {@link OtherPropertyType }
     *     
     */
    public OtherPropertyType getOtherProperty() {
        return otherProperty;
    }

    /**
     * Sets the value of the otherProperty property.
     * 
     * @param value
     *     allowed object is
     *     {@link OtherPropertyType }
     *     
     */
    public void setOtherProperty(OtherPropertyType value) {
        this.otherProperty = value;
    }

}
