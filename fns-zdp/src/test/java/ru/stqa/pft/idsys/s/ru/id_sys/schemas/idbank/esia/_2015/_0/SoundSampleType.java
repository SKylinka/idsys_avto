
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.esia._2015._0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Данные звукового биометрического образца
 * 
 * <p>Java class for SoundSampleType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SoundSampleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="Part" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedShort" />
 *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *       &lt;attribute name="Desc" use="required" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}DescType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SoundSampleType")
public class SoundSampleType {

    @XmlAttribute(name = "Part", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int part;
    @XmlAttribute(name = "Start", required = true)
    protected BigDecimal start;
    @XmlAttribute(name = "End", required = true)
    protected BigDecimal end;
    @XmlAttribute(name = "Desc", required = true)
    protected DescType desc;

    /**
     * Gets the value of the part property.
     * 
     */
    public int getPart() {
        return part;
    }

    /**
     * Sets the value of the part property.
     * 
     */
    public void setPart(int value) {
        this.part = value;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStart(BigDecimal value) {
        this.start = value;
    }

    /**
     * Gets the value of the end property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEnd() {
        return end;
    }

    /**
     * Sets the value of the end property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEnd(BigDecimal value) {
        this.end = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link DescType }
     *     
     */
    public DescType getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link DescType }
     *     
     */
    public void setDesc(DescType value) {
        this.desc = value;
    }

}
