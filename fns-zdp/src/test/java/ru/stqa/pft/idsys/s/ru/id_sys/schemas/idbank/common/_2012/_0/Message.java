
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersRq;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0.LookupCustomersRs;


/**
 * Абстрактный тип сообщения веб-сервиса iD Банк-ФССП
 * 
 * <p>Java class for Message complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Message">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="msgID" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}MessageID" minOccurs="0"/>
 *         &lt;element name="msgTimestamp" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}DateTime" minOccurs="0"/>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="systemID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dstSystemID" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *               &lt;minLength value="1"/>
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="msgParameters" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="parameter" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Parameter" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="msgMode" type="{http://www.w3.org/2001/XMLSchema}token" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Message", propOrder = {
    "msgID",
    "msgTimestamp",
    "version",
    "systemID",
    "dstSystemID",
    "msgParameters",
    "msgMode"
})
@XmlSeeAlso({
    LookupCustomersRq.class,
    LookupCustomersRs.class,
    Request.class,
    Response.class
})
public abstract class Message {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgID;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar msgTimestamp;
    protected String version;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String systemID;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String dstSystemID;
    protected Message.MsgParameters msgParameters;
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String msgMode;

    /**
     * Gets the value of the msgID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgID() {
        return msgID;
    }

    /**
     * Sets the value of the msgID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgID(String value) {
        this.msgID = value;
    }

    /**
     * Gets the value of the msgTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMsgTimestamp() {
        return msgTimestamp;
    }

    /**
     * Sets the value of the msgTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMsgTimestamp(XMLGregorianCalendar value) {
        this.msgTimestamp = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the systemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystemID() {
        return systemID;
    }

    /**
     * Sets the value of the systemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystemID(String value) {
        this.systemID = value;
    }

    /**
     * Gets the value of the dstSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDstSystemID() {
        return dstSystemID;
    }

    /**
     * Sets the value of the dstSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDstSystemID(String value) {
        this.dstSystemID = value;
    }

    /**
     * Gets the value of the msgParameters property.
     * 
     * @return
     *     possible object is
     *     {@link Message.MsgParameters }
     *     
     */
    public Message.MsgParameters getMsgParameters() {
        return msgParameters;
    }

    /**
     * Sets the value of the msgParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link Message.MsgParameters }
     *     
     */
    public void setMsgParameters(Message.MsgParameters value) {
        this.msgParameters = value;
    }

    /**
     * Gets the value of the msgMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgMode() {
        return msgMode;
    }

    /**
     * Sets the value of the msgMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgMode(String value) {
        this.msgMode = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="parameter" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Parameter" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "parameter"
    })
    public static class MsgParameters {

        @XmlElement(required = true)
        protected List<Parameter> parameter;

        /**
         * Gets the value of the parameter property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the parameter property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getParameter().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Parameter }
         * 
         * 
         */
        public List<Parameter> getParameter() {
            if (parameter == null) {
                parameter = new ArrayList<Parameter>();
            }
            return this.parameter;
        }

    }

}
