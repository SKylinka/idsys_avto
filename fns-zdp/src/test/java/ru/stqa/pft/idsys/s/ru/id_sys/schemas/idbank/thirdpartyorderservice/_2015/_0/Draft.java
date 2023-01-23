
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.thirdpartyorderservice._2015._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Заявка
 * 
 * <p>Java class for Draft complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Draft">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="fields" type="{http://www.id-sys.ru/schemas/idbank/ThirdPartyOrderService/2015/0.01/}ListFields"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Draft", propOrder = {
    "version",
    "fields"
})
public class Draft {

    protected long version;
    @XmlElement(required = true)
    protected ListFields fields;

    /**
     * Gets the value of the version property.
     * 
     */
    public long getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     */
    public void setVersion(long value) {
        this.version = value;
    }

    /**
     * Gets the value of the fields property.
     * 
     * @return
     *     possible object is
     *     {@link ListFields }
     *     
     */
    public ListFields getFields() {
        return fields;
    }

    /**
     * Sets the value of the fields property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListFields }
     *     
     */
    public void setFields(ListFields value) {
        this.fields = value;
    }

}
