
package ru.stqa.pft.idsys.s.ru.cbr.dsig.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.cbr.dsig.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MACValue_QNAME = new QName("urn:cbr-ru:dsig:v1.1", "MACValue");
    private final static QName _SigValue_QNAME = new QName("urn:cbr-ru:dsig:v1.1", "SigValue");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.cbr.dsig.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SigValueType }
     * 
     */
    public SigValueType createSigValueType() {
        return new SigValueType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cbr-ru:dsig:v1.1", name = "MACValue")
    public JAXBElement<byte[]> createMACValue(byte[] value) {
        return new JAXBElement<byte[]>(_MACValue_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SigValueType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "urn:cbr-ru:dsig:v1.1", name = "SigValue")
    public JAXBElement<SigValueType> createSigValue(SigValueType value) {
        return new JAXBElement<SigValueType>(_SigValue_QNAME, SigValueType.class, null, value);
    }

}
