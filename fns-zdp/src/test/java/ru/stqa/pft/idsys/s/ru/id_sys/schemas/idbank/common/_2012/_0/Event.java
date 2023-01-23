
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Событие
 * 
 * <p>Java class for Event complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Event">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *       &lt;sequence>
 *         &lt;element name="Payload" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="Object" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object"/>
 *                             &lt;element name="Error" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Error"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Event", propOrder = {
    "payload"
})
public class Event
    extends java.lang.Object
{

    @XmlElement(name = "Payload")
    protected Event.Payload payload;

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     {@link Event.Payload }
     *     
     */
    public Event.Payload getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     {@link Event.Payload }
     *     
     */
    public void setPayload(Event.Payload value) {
        this.payload = value;
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
     *         &lt;element name="Item" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="Object" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object"/>
     *                   &lt;element name="Error" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Error"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "item"
    })
    public static class Payload {

        @XmlElement(name = "Item", required = true)
        protected List<Event.Payload.Item> item;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Event.Payload.Item }
         * 
         * 
         */
        public List<Event.Payload.Item> getItem() {
            if (item == null) {
                item = new ArrayList<Event.Payload.Item>();
            }
            return this.item;
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
         *       &lt;choice>
         *         &lt;element name="Object" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object"/>
         *         &lt;element name="Error" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Error"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "object",
            "error"
        })
        public static class Item {

            @XmlElement(name = "Object")
            protected java.lang.Object object;
            @XmlElement(name = "Error")
            protected java.lang.Error error;

            /**
             * Gets the value of the object property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.Object }
             *     
             */
            public java.lang.Object getObject() {
                return object;
            }

            /**
             * Sets the value of the object property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.Object }
             *     
             */
            public void setObject(java.lang.Object value) {
                this.object = value;
            }

            /**
             * Gets the value of the error property.
             * 
             * @return
             *     possible object is
             *     {@link java.lang.Error }
             *     
             */
            public java.lang.Error getError() {
                return error;
            }

            /**
             * Sets the value of the error property.
             * 
             * @param value
             *     allowed object is
             *     {@link java.lang.Error }
             *     
             */
            public void setError(java.lang.Error value) {
                this.error = value;
            }

        }

    }

}
