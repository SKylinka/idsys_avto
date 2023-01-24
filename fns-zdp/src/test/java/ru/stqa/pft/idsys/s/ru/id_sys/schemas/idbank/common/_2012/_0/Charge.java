
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import ru.stqa.pft.idsys.s.ru.cbr.ed.v2.ED101;


/**
 * Начисление
 * 
 * <p>Java class for Charge complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Charge">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *       &lt;sequence>
 *         &lt;element name="Order" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                   &lt;element name="FeesAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Agents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Agent" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *                           &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *                           &lt;attribute name="fee" type="{http://www.w3.org/2001/XMLSchema}long" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Customer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Identification" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}id" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{urn:cbr-ru:ed:v2.0}ED101"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="validFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="validTo" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="paid" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="cancelled" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="amountPaid" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="year" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="month" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Charge", propOrder = {
    "order",
    "agents",
    "customer",
    "ed101"
})
public class Charge
    extends java.lang.Object
{

    @XmlElement(name = "Order")
    protected Charge.Order order;
    @XmlElement(name = "Agents")
    protected Charge.Agents agents;
    @XmlElement(name = "Customer")
    protected Charge.Customer customer;
    @XmlElement(name = "ED101", namespace = "urn:cbr-ru:ed:v2.0", required = true)
    protected ED101 ed101;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String status;
    @XmlAttribute(name = "validFrom")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validFrom;
    @XmlAttribute(name = "validTo")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar validTo;
    @XmlAttribute(name = "paid")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar paid;
    @XmlAttribute(name = "cancelled")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancelled;
    @XmlAttribute(name = "amountPaid")
    protected Long amountPaid;
    @XmlAttribute(name = "year")
    protected Integer year;
    @XmlAttribute(name = "month")
    protected Integer month;

    /**
     * Gets the value of the order property.
     * 
     * @return
     *     possible object is
     *     {@link Charge.Order }
     *     
     */
    public Charge.Order getOrder() {
        return order;
    }

    /**
     * Sets the value of the order property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge.Order }
     *     
     */
    public void setOrder(Charge.Order value) {
        this.order = value;
    }

    /**
     * Gets the value of the agents property.
     * 
     * @return
     *     possible object is
     *     {@link Charge.Agents }
     *     
     */
    public Charge.Agents getAgents() {
        return agents;
    }

    /**
     * Sets the value of the agents property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge.Agents }
     *     
     */
    public void setAgents(Charge.Agents value) {
        this.agents = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Charge.Customer }
     *     
     */
    public Charge.Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Charge.Customer }
     *     
     */
    public void setCustomer(Charge.Customer value) {
        this.customer = value;
    }

    /**
     * Gets the value of the ed101 property.
     * 
     * @return
     *     possible object is
     *     {@link ED101 }
     *     
     */
    public ED101 getED101() {
        return ed101;
    }

    /**
     * Sets the value of the ed101 property.
     * 
     * @param value
     *     allowed object is
     *     {@link ED101 }
     *     
     */
    public void setED101(ED101 value) {
        this.ed101 = value;
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
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the validFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidFrom() {
        return validFrom;
    }

    /**
     * Sets the value of the validFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidFrom(XMLGregorianCalendar value) {
        this.validFrom = value;
    }

    /**
     * Gets the value of the validTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValidTo() {
        return validTo;
    }

    /**
     * Sets the value of the validTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValidTo(XMLGregorianCalendar value) {
        this.validTo = value;
    }

    /**
     * Gets the value of the paid property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getPaid() {
        return paid;
    }

    /**
     * Sets the value of the paid property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setPaid(XMLGregorianCalendar value) {
        this.paid = value;
    }

    /**
     * Gets the value of the cancelled property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancelled() {
        return cancelled;
    }

    /**
     * Sets the value of the cancelled property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancelled(XMLGregorianCalendar value) {
        this.cancelled = value;
    }

    /**
     * Gets the value of the amountPaid property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAmountPaid() {
        return amountPaid;
    }

    /**
     * Sets the value of the amountPaid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAmountPaid(Long value) {
        this.amountPaid = value;
    }

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYear(Integer value) {
        this.year = value;
    }

    /**
     * Gets the value of the month property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMonth() {
        return month;
    }

    /**
     * Sets the value of the month property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMonth(Integer value) {
        this.month = value;
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
     *         &lt;element name="Agent" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
     *                 &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}token" />
     *                 &lt;attribute name="fee" type="{http://www.w3.org/2001/XMLSchema}long" />
     *               &lt;/extension>
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
        "agent"
    })
    public static class Agents {

        @XmlElement(name = "Agent", required = true)
        protected List<Charge.Agents.Agent> agent;

        /**
         * Gets the value of the agent property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the agent property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAgent().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Charge.Agents.Agent }
         * 
         * 
         */
        public List<Charge.Agents.Agent> getAgent() {
            if (agent == null) {
                agent = new ArrayList<Charge.Agents.Agent>();
            }
            return this.agent;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
         *       &lt;attribute name="orderID" type="{http://www.w3.org/2001/XMLSchema}token" />
         *       &lt;attribute name="fee" type="{http://www.w3.org/2001/XMLSchema}long" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Agent
            extends java.lang.Object
        {

            @XmlAttribute(name = "orderID")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String orderID;
            @XmlAttribute(name = "fee")
            protected Long fee;

            /**
             * Gets the value of the orderID property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrderID() {
                return orderID;
            }

            /**
             * Sets the value of the orderID property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrderID(String value) {
                this.orderID = value;
            }

            /**
             * Gets the value of the fee property.
             * 
             * @return
             *     possible object is
             *     {@link Long }
             *     
             */
            public Long getFee() {
                return fee;
            }

            /**
             * Sets the value of the fee property.
             * 
             * @param value
             *     allowed object is
             *     {@link Long }
             *     
             */
            public void setFee(Long value) {
                this.fee = value;
            }

        }

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
     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Identification" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}id" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
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
        "name",
        "phone",
        "email",
        "identification"
    })
    public static class Customer {

        @XmlElement(name = "Name")
        protected String name;
        @XmlElement(name = "Phone")
        protected String phone;
        @XmlElement(name = "Email")
        protected String email;
        @XmlElement(name = "Identification")
        protected Charge.Customer.Identification identification;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the email property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * Sets the value of the email property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

        /**
         * Gets the value of the identification property.
         * 
         * @return
         *     possible object is
         *     {@link Charge.Customer.Identification }
         *     
         */
        public Charge.Customer.Identification getIdentification() {
            return identification;
        }

        /**
         * Sets the value of the identification property.
         * 
         * @param value
         *     allowed object is
         *     {@link Charge.Customer.Identification }
         *     
         */
        public void setIdentification(Charge.Customer.Identification value) {
            this.identification = value;
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
         *         &lt;element ref="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}id" maxOccurs="unbounded"/>
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
            "id"
        })
        public static class Identification {

            @XmlElement(required = true)
            protected List<Id> id;

            /**
             * Gets the value of the id property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the id property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getId().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Id }
             * 
             * 
             */
            public List<Id> getId() {
                if (id == null) {
                    id = new ArrayList<Id>();
                }
                return this.id;
            }

        }

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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Sum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *         &lt;element name="FeesAmount" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}token" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "sum",
        "feesAmount"
    })
    public static class Order {

        @XmlElement(name = "Description")
        protected String description;
        @XmlElement(name = "Sum")
        protected Long sum;
        @XmlElement(name = "FeesAmount")
        protected Long feesAmount;
        @XmlAttribute(name = "ID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String id;

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the sum property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getSum() {
            return sum;
        }

        /**
         * Sets the value of the sum property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setSum(Long value) {
            this.sum = value;
        }

        /**
         * Gets the value of the feesAmount property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getFeesAmount() {
            return feesAmount;
        }

        /**
         * Sets the value of the feesAmount property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setFeesAmount(Long value) {
            this.feesAmount = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }

    }

}
