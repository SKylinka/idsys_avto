
package ru.stqa.pft.idsys.s.ru.cbr.ed.v2;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Базовый комплексный тип для обмена с ФК.
 * 
 * <p>Java class for EDWithDeclaration complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EDWithDeclaration">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:cbr-ru:ed:v2.0}ED">
 *       &lt;attribute name="DeclarationDate" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DateType" />
 *       &lt;attribute name="DeclarationNo" use="required" type="{urn:cbr-ru:ed:leaftypes:v2.0}DeclarationNoType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EDWithDeclaration")
public class EDWithDeclaration
    extends ED
{

    @XmlAttribute(name = "DeclarationDate", required = true)
    protected XMLGregorianCalendar declarationDate;
    @XmlAttribute(name = "DeclarationNo", required = true)
    protected BigInteger declarationNo;

    /**
     * Gets the value of the declarationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeclarationDate() {
        return declarationDate;
    }

    /**
     * Sets the value of the declarationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeclarationDate(XMLGregorianCalendar value) {
        this.declarationDate = value;
    }

    /**
     * Gets the value of the declarationNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDeclarationNo() {
        return declarationNo;
    }

    /**
     * Sets the value of the declarationNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDeclarationNo(BigInteger value) {
        this.declarationNo = value;
    }

}
