
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Информация, связанная с процессом миграции Участника
 * 
 * <p>Java class for Migrated complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Migrated">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MigratedInd" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}IndicatorType" />
 *       &lt;attribute name="LastRABISDate" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Migrated")
public class Migrated {

    @XmlAttribute(name = "MigratedInd", required = true)
    protected boolean migratedInd;
    @XmlAttribute(name = "LastRABISDate")
    protected XMLGregorianCalendar lastRABISDate;

    /**
     * Gets the value of the migratedInd property.
     * 
     */
    public boolean isMigratedInd() {
        return migratedInd;
    }

    /**
     * Sets the value of the migratedInd property.
     * 
     */
    public void setMigratedInd(boolean value) {
        this.migratedInd = value;
    }

    /**
     * Gets the value of the lastRABISDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRABISDate() {
        return lastRABISDate;
    }

    /**
     * Sets the value of the lastRABISDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRABISDate(XMLGregorianCalendar value) {
        this.lastRABISDate = value;
    }

}
