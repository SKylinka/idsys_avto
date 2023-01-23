
package ru.stqa.pft.idsys.s.com.triasoft.dev.schemas.eis.eregistry.pppr._2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Тип Адрес в РФ (по ФИАС) с указанием регистрации в атрибуте
 * 
 * <p>Java class for AddressPrivatePersonRFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddressPrivatePersonRFType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://dev.triasoft.com/schemas/eis/eregistry/pppr/2.0}AddressRFType">
 *       &lt;attribute name="registration" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressPrivatePersonRFType")
public class AddressPrivatePersonRFType
    extends AddressRFType
{

    @XmlAttribute(name = "registration", required = true)
    protected boolean registration;

    /**
     * Gets the value of the registration property.
     * 
     */
    public boolean isRegistration() {
        return registration;
    }

    /**
     * Sets the value of the registration property.
     * 
     */
    public void setRegistration(boolean value) {
        this.registration = value;
    }

}
