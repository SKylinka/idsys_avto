
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.Object;


/**
 * Документ клиента
 * 
 * <p>Java class for CustomerDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDocument">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *       &lt;choice>
 *         &lt;element name="BinaryDocument" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerDocument", propOrder = {
    "binaryDocument"
})
public class CustomerDocument
    extends Object
{

    @XmlElement(name = "BinaryDocument")
    protected byte[] binaryDocument;

    /**
     * Gets the value of the binaryDocument property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getBinaryDocument() {
        return binaryDocument;
    }

    /**
     * Sets the value of the binaryDocument property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setBinaryDocument(byte[] value) {
        this.binaryDocument = value;
    }

}
