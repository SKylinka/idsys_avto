
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.cik._2017._0;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Персона complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Персона">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ПерсИнфо" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ФИОД">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Фамилия" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Имя" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Отчество" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ДатаРожд" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Документ">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодВидДок" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Серия" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Номер" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Адрес">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСубъекта" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="НеконфАдрес" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КонфАдрес" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="МестоРождения" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ЦенныеБумаги" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Организация">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Название" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ИННОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ПИФ" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Статус" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ОКСМ" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Страна" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ДоляПроцент" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ДоляЧислитель" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ДоляЗнаменатель" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КодСубОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="НеконфАдрОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КонфАдрОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Бумага">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодТипБум" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КодИдент" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КодКласс" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КодВидБум" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КодКатег" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Колво" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
 *                           &lt;attribute name="КолвоЧисл" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
 *                           &lt;attribute name="КолвоЗнам" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
 *                           &lt;attribute name="Стоимость" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="ДатаСведОтв" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдБумаги" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Счета" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Счет">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ВидСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="НомерСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Остаток" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                           &lt;attribute name="ДатаСведОтв" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="КредитОрг">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="НаимКредит" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КодСубКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="НеконфАдрКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="КонфАдрКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ИдСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="СлужИнфо" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ИДИнфо">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="КодСубъекта" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Кампания" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                           &lt;attribute name="Система" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Наименование">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Выборы" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Субъект" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ДатаСвед" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ВРНКанд" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Ид" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "\u041f\u0435\u0440\u0441\u043e\u043d\u0430", propOrder = {
    "\u043f\u0435\u0440\u0441\u0418\u043d\u0444\u043e",
    "\u0446\u0435\u043d\u043d\u044b\u0435\u0411\u0443\u043c\u0430\u0433\u0438",
    "\u0441\u0447\u0435\u0442\u0430",
    "\u0441\u043b\u0443\u0436\u0418\u043d\u0444\u043e"
})
public class Персона {

    @XmlElement(name = "\u041f\u0435\u0440\u0441\u0418\u043d\u0444\u043e")
    protected Персона.ПерсИнфо персИнфо;
    @XmlElement(name = "\u0426\u0435\u043d\u043d\u044b\u0435\u0411\u0443\u043c\u0430\u0433\u0438")
    protected List<Персона.ЦенныеБумаги> ценныеБумаги;
    @XmlElement(name = "\u0421\u0447\u0435\u0442\u0430")
    protected List<Персона.Счета> счета;
    @XmlElement(name = "\u0421\u043b\u0443\u0436\u0418\u043d\u0444\u043e")
    protected Персона.СлужИнфо служИнфо;
    @XmlAttribute(name = "\u0418\u0434", required = true)
    protected String ид;

    /**
     * Gets the value of the персИнфо property.
     * 
     * @return
     *     possible object is
     *     {@link Персона.ПерсИнфо }
     *     
     */
    public Персона.ПерсИнфо getПерсИнфо() {
        return персИнфо;
    }

    /**
     * Sets the value of the персИнфо property.
     * 
     * @param value
     *     allowed object is
     *     {@link Персона.ПерсИнфо }
     *     
     */
    public void setПерсИнфо(Персона.ПерсИнфо value) {
        this.персИнфо = value;
    }

    /**
     * Gets the value of the ценныеБумаги property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ценныеБумаги property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getЦенныеБумаги().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Персона.ЦенныеБумаги }
     * 
     * 
     */
    public List<Персона.ЦенныеБумаги> getЦенныеБумаги() {
        if (ценныеБумаги == null) {
            ценныеБумаги = new ArrayList<Персона.ЦенныеБумаги>();
        }
        return this.ценныеБумаги;
    }

    /**
     * Gets the value of the счета property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the счета property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getСчета().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Персона.Счета }
     * 
     * 
     */
    public List<Персона.Счета> getСчета() {
        if (счета == null) {
            счета = new ArrayList<Персона.Счета>();
        }
        return this.счета;
    }

    /**
     * Gets the value of the служИнфо property.
     * 
     * @return
     *     possible object is
     *     {@link Персона.СлужИнфо }
     *     
     */
    public Персона.СлужИнфо getСлужИнфо() {
        return служИнфо;
    }

    /**
     * Sets the value of the служИнфо property.
     * 
     * @param value
     *     allowed object is
     *     {@link Персона.СлужИнфо }
     *     
     */
    public void setСлужИнфо(Персона.СлужИнфо value) {
        this.служИнфо = value;
    }

    /**
     * Gets the value of the ид property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getИд() {
        return ид;
    }

    /**
     * Sets the value of the ид property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setИд(String value) {
        this.ид = value;
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
     *         &lt;element name="ФИОД">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Фамилия" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Имя" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Отчество" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ДатаРожд" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Документ">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодВидДок" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Серия" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Номер" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Адрес">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодСубъекта" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="НеконфАдрес" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КонфАдрес" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="МестоРождения" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "\u0444\u0438\u043e\u0434",
        "\u0434\u043e\u043a\u0443\u043c\u0435\u043d\u0442",
        "\u0430\u0434\u0440\u0435\u0441"
    })
    public static class ПерсИнфо {

        @XmlElement(name = "\u0424\u0418\u041e\u0414", required = true)
        protected Персона.ПерсИнфо.ФИОД фиод;
        @XmlElement(name = "\u0414\u043e\u043a\u0443\u043c\u0435\u043d\u0442", required = true)
        protected Персона.ПерсИнфо.Документ документ;
        @XmlElement(name = "\u0410\u0434\u0440\u0435\u0441", required = true)
        protected Персона.ПерсИнфо.Адрес адрес;

        /**
         * Gets the value of the фиод property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.ПерсИнфо.ФИОД }
         *     
         */
        public Персона.ПерсИнфо.ФИОД getФИОД() {
            return фиод;
        }

        /**
         * Sets the value of the фиод property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.ПерсИнфо.ФИОД }
         *     
         */
        public void setФИОД(Персона.ПерсИнфо.ФИОД value) {
            this.фиод = value;
        }

        /**
         * Gets the value of the документ property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.ПерсИнфо.Документ }
         *     
         */
        public Персона.ПерсИнфо.Документ getДокумент() {
            return документ;
        }

        /**
         * Sets the value of the документ property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.ПерсИнфо.Документ }
         *     
         */
        public void setДокумент(Персона.ПерсИнфо.Документ value) {
            this.документ = value;
        }

        /**
         * Gets the value of the адрес property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.ПерсИнфо.Адрес }
         *     
         */
        public Персона.ПерсИнфо.Адрес getАдрес() {
            return адрес;
        }

        /**
         * Sets the value of the адрес property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.ПерсИнфо.Адрес }
         *     
         */
        public void setАдрес(Персона.ПерсИнфо.Адрес value) {
            this.адрес = value;
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
         *       &lt;attribute name="КодСубъекта" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="НеконфАдрес" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КонфАдрес" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="МестоРождения" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Адрес {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0430", required = true)
            protected String кодСубъекта;
            @XmlAttribute(name = "\u041d\u0435\u043a\u043e\u043d\u0444\u0410\u0434\u0440\u0435\u0441", required = true)
            protected String неконфАдрес;
            @XmlAttribute(name = "\u041a\u043e\u043d\u0444\u0410\u0434\u0440\u0435\u0441", required = true)
            protected String конфАдрес;
            @XmlAttribute(name = "\u041c\u0435\u0441\u0442\u043e\u0420\u043e\u0436\u0434\u0435\u043d\u0438\u044f", required = true)
            protected String местоРождения;

            /**
             * Gets the value of the кодСубъекта property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодСубъекта() {
                return кодСубъекта;
            }

            /**
             * Sets the value of the кодСубъекта property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодСубъекта(String value) {
                this.кодСубъекта = value;
            }

            /**
             * Gets the value of the неконфАдрес property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНеконфАдрес() {
                return неконфАдрес;
            }

            /**
             * Sets the value of the неконфАдрес property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНеконфАдрес(String value) {
                this.неконфАдрес = value;
            }

            /**
             * Gets the value of the конфАдрес property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКонфАдрес() {
                return конфАдрес;
            }

            /**
             * Sets the value of the конфАдрес property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКонфАдрес(String value) {
                this.конфАдрес = value;
            }

            /**
             * Gets the value of the местоРождения property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getМестоРождения() {
                return местоРождения;
            }

            /**
             * Sets the value of the местоРождения property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setМестоРождения(String value) {
                this.местоРождения = value;
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
         *       &lt;attribute name="КодВидДок" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Серия" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Номер" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Документ {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0414\u043e\u043a", required = true)
            protected String кодВидДок;
            @XmlAttribute(name = "\u0421\u0435\u0440\u0438\u044f", required = true)
            protected String серия;
            @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440", required = true)
            protected String номер;

            /**
             * Gets the value of the кодВидДок property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодВидДок() {
                return кодВидДок;
            }

            /**
             * Sets the value of the кодВидДок property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодВидДок(String value) {
                this.кодВидДок = value;
            }

            /**
             * Gets the value of the серия property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСерия() {
                return серия;
            }

            /**
             * Sets the value of the серия property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСерия(String value) {
                this.серия = value;
            }

            /**
             * Gets the value of the номер property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНомер() {
                return номер;
            }

            /**
             * Sets the value of the номер property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНомер(String value) {
                this.номер = value;
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
         *       &lt;attribute name="Фамилия" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Имя" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Отчество" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ДатаРожд" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ФИОД {

            @XmlAttribute(name = "\u0424\u0430\u043c\u0438\u043b\u0438\u044f", required = true)
            protected String фамилия;
            @XmlAttribute(name = "\u0418\u043c\u044f", required = true)
            protected String имя;
            @XmlAttribute(name = "\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e", required = true)
            protected String отчество;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0420\u043e\u0436\u0434")
            protected String датаРожд;

            /**
             * Gets the value of the фамилия property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getФамилия() {
                return фамилия;
            }

            /**
             * Sets the value of the фамилия property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setФамилия(String value) {
                this.фамилия = value;
            }

            /**
             * Gets the value of the имя property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИмя() {
                return имя;
            }

            /**
             * Sets the value of the имя property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИмя(String value) {
                this.имя = value;
            }

            /**
             * Gets the value of the отчество property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОтчество() {
                return отчество;
            }

            /**
             * Sets the value of the отчество property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОтчество(String value) {
                this.отчество = value;
            }

            /**
             * Gets the value of the датаРожд property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДатаРожд() {
                return датаРожд;
            }

            /**
             * Sets the value of the датаРожд property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДатаРожд(String value) {
                this.датаРожд = value;
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
     *         &lt;element name="ИДИнфо">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодСубъекта" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Кампания" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="Система" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Наименование">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Выборы" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Субъект" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ДатаСвед" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ВРНКанд" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0438\u0434\u0418\u043d\u0444\u043e",
        "\u043d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435"
    })
    public static class СлужИнфо {

        @XmlElement(name = "\u0418\u0414\u0418\u043d\u0444\u043e", required = true)
        protected Персона.СлужИнфо.ИДИнфо идИнфо;
        @XmlElement(name = "\u041d\u0430\u0438\u043c\u0435\u043d\u043e\u0432\u0430\u043d\u0438\u0435", required = true)
        protected Персона.СлужИнфо.Наименование наименование;
        @XmlAttribute(name = "\u0412\u0420\u041d\u041a\u0430\u043d\u0434", required = true)
        protected BigInteger врнКанд;

        /**
         * Gets the value of the идИнфо property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.СлужИнфо.ИДИнфо }
         *     
         */
        public Персона.СлужИнфо.ИДИнфо getИДИнфо() {
            return идИнфо;
        }

        /**
         * Sets the value of the идИнфо property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.СлужИнфо.ИДИнфо }
         *     
         */
        public void setИДИнфо(Персона.СлужИнфо.ИДИнфо value) {
            this.идИнфо = value;
        }

        /**
         * Gets the value of the наименование property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.СлужИнфо.Наименование }
         *     
         */
        public Персона.СлужИнфо.Наименование getНаименование() {
            return наименование;
        }

        /**
         * Sets the value of the наименование property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.СлужИнфо.Наименование }
         *     
         */
        public void setНаименование(Персона.СлужИнфо.Наименование value) {
            this.наименование = value;
        }

        /**
         * Gets the value of the врнКанд property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getВРНКанд() {
            return врнКанд;
        }

        /**
         * Sets the value of the врнКанд property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setВРНКанд(BigInteger value) {
            this.врнКанд = value;
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
         *       &lt;attribute name="КодСубъекта" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Кампания" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="Система" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ИДИнфо {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0443\u0431\u044a\u0435\u043a\u0442\u0430", required = true)
            protected String кодСубъекта;
            @XmlAttribute(name = "\u041a\u0430\u043c\u043f\u0430\u043d\u0438\u044f", required = true)
            protected BigInteger кампания;
            @XmlAttribute(name = "\u0421\u0438\u0441\u0442\u0435\u043c\u0430", required = true)
            @XmlSchemaType(name = "unsignedByte")
            protected short система;

            /**
             * Gets the value of the кодСубъекта property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодСубъекта() {
                return кодСубъекта;
            }

            /**
             * Sets the value of the кодСубъекта property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодСубъекта(String value) {
                this.кодСубъекта = value;
            }

            /**
             * Gets the value of the кампания property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getКампания() {
                return кампания;
            }

            /**
             * Sets the value of the кампания property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setКампания(BigInteger value) {
                this.кампания = value;
            }

            /**
             * Gets the value of the система property.
             * 
             */
            public short getСистема() {
                return система;
            }

            /**
             * Sets the value of the система property.
             * 
             */
            public void setСистема(short value) {
                this.система = value;
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
         *       &lt;attribute name="Выборы" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Субъект" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ДатаСвед" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Наименование {

            @XmlAttribute(name = "\u0412\u044b\u0431\u043e\u0440\u044b", required = true)
            protected String выборы;
            @XmlAttribute(name = "\u0421\u0443\u0431\u044a\u0435\u043a\u0442", required = true)
            protected String субъект;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0421\u0432\u0435\u0434", required = true)
            protected String датаСвед;

            /**
             * Gets the value of the выборы property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getВыборы() {
                return выборы;
            }

            /**
             * Sets the value of the выборы property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setВыборы(String value) {
                this.выборы = value;
            }

            /**
             * Gets the value of the субъект property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСубъект() {
                return субъект;
            }

            /**
             * Sets the value of the субъект property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСубъект(String value) {
                this.субъект = value;
            }

            /**
             * Gets the value of the датаСвед property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДатаСвед() {
                return датаСвед;
            }

            /**
             * Sets the value of the датаСвед property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДатаСвед(String value) {
                this.датаСвед = value;
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
     *         &lt;element name="Счет">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ВидСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="НомерСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Остаток" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="ДатаСведОтв" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="КредитОрг">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="НаимКредит" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КодСубКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="НеконфАдрКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КонфАдрКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u0441\u0447\u0435\u0442",
        "\u043a\u0440\u0435\u0434\u0438\u0442\u041e\u0440\u0433"
    })
    public static class Счета {

        @XmlElement(name = "\u0421\u0447\u0435\u0442", required = true)
        protected Персона.Счета.Счет счет;
        @XmlElement(name = "\u041a\u0440\u0435\u0434\u0438\u0442\u041e\u0440\u0433", required = true)
        protected Персона.Счета.КредитОрг кредитОрг;
        @XmlAttribute(name = "\u0418\u0434\u0421\u0447\u0435\u0442\u0430", required = true)
        protected String идСчета;

        /**
         * Gets the value of the счет property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.Счета.Счет }
         *     
         */
        public Персона.Счета.Счет getСчет() {
            return счет;
        }

        /**
         * Sets the value of the счет property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.Счета.Счет }
         *     
         */
        public void setСчет(Персона.Счета.Счет value) {
            this.счет = value;
        }

        /**
         * Gets the value of the кредитОрг property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.Счета.КредитОрг }
         *     
         */
        public Персона.Счета.КредитОрг getКредитОрг() {
            return кредитОрг;
        }

        /**
         * Sets the value of the кредитОрг property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.Счета.КредитОрг }
         *     
         */
        public void setКредитОрг(Персона.Счета.КредитОрг value) {
            this.кредитОрг = value;
        }

        /**
         * Gets the value of the идСчета property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдСчета() {
            return идСчета;
        }

        /**
         * Sets the value of the идСчета property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдСчета(String value) {
            this.идСчета = value;
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
         *       &lt;attribute name="НаимКредит" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КодСубКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="НеконфАдрКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КонфАдрКред" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class КредитОрг {

            @XmlAttribute(name = "\u041d\u0430\u0438\u043c\u041a\u0440\u0435\u0434\u0438\u0442", required = true)
            protected String наимКредит;
            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0443\u0431\u041a\u0440\u0435\u0434", required = true)
            protected String кодСубКред;
            @XmlAttribute(name = "\u041d\u0435\u043a\u043e\u043d\u0444\u0410\u0434\u0440\u041a\u0440\u0435\u0434", required = true)
            protected String неконфАдрКред;
            @XmlAttribute(name = "\u041a\u043e\u043d\u0444\u0410\u0434\u0440\u041a\u0440\u0435\u0434", required = true)
            protected String конфАдрКред;

            /**
             * Gets the value of the наимКредит property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНаимКредит() {
                return наимКредит;
            }

            /**
             * Sets the value of the наимКредит property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНаимКредит(String value) {
                this.наимКредит = value;
            }

            /**
             * Gets the value of the кодСубКред property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодСубКред() {
                return кодСубКред;
            }

            /**
             * Sets the value of the кодСубКред property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодСубКред(String value) {
                this.кодСубКред = value;
            }

            /**
             * Gets the value of the неконфАдрКред property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНеконфАдрКред() {
                return неконфАдрКред;
            }

            /**
             * Sets the value of the неконфАдрКред property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНеконфАдрКред(String value) {
                this.неконфАдрКред = value;
            }

            /**
             * Gets the value of the конфАдрКред property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКонфАдрКред() {
                return конфАдрКред;
            }

            /**
             * Sets the value of the конфАдрКред property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКонфАдрКред(String value) {
                this.конфАдрКред = value;
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
         *       &lt;attribute name="ВидСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="НомерСчета" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Остаток" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="ДатаСведОтв" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Счет {

            @XmlAttribute(name = "\u0412\u0438\u0434\u0421\u0447\u0435\u0442\u0430", required = true)
            protected String видСчета;
            @XmlAttribute(name = "\u041d\u043e\u043c\u0435\u0440\u0421\u0447\u0435\u0442\u0430", required = true)
            protected String номерСчета;
            @XmlAttribute(name = "\u041e\u0441\u0442\u0430\u0442\u043e\u043a", required = true)
            protected BigDecimal остаток;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0421\u0432\u0435\u0434\u041e\u0442\u0432")
            protected String датаСведОтв;

            /**
             * Gets the value of the видСчета property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getВидСчета() {
                return видСчета;
            }

            /**
             * Sets the value of the видСчета property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setВидСчета(String value) {
                this.видСчета = value;
            }

            /**
             * Gets the value of the номерСчета property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНомерСчета() {
                return номерСчета;
            }

            /**
             * Sets the value of the номерСчета property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНомерСчета(String value) {
                this.номерСчета = value;
            }

            /**
             * Gets the value of the остаток property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getОстаток() {
                return остаток;
            }

            /**
             * Sets the value of the остаток property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setОстаток(BigDecimal value) {
                this.остаток = value;
            }

            /**
             * Gets the value of the датаСведОтв property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДатаСведОтв() {
                return датаСведОтв;
            }

            /**
             * Sets the value of the датаСведОтв property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДатаСведОтв(String value) {
                this.датаСведОтв = value;
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
     *         &lt;element name="Организация">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Название" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ИННОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ПИФ" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Статус" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ОКСМ" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Страна" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ДоляПроцент" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ДоляЧислитель" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ДоляЗнаменатель" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КодСубОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="НеконфАдрОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КонфАдрОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Бумага">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="КодТипБум" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КодИдент" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КодКласс" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КодВидБум" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="КодКатег" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Колво" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
     *                 &lt;attribute name="КолвоЧисл" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
     *                 &lt;attribute name="КолвоЗнам" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
     *                 &lt;attribute name="Стоимость" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *                 &lt;attribute name="ДатаСведОтв" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ИдБумаги" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "\u043e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f",
        "\u0431\u0443\u043c\u0430\u0433\u0430"
    })
    public static class ЦенныеБумаги {

        @XmlElement(name = "\u041e\u0440\u0433\u0430\u043d\u0438\u0437\u0430\u0446\u0438\u044f", required = true)
        protected Персона.ЦенныеБумаги.Организация организация;
        @XmlElement(name = "\u0411\u0443\u043c\u0430\u0433\u0430", required = true)
        protected Персона.ЦенныеБумаги.Бумага бумага;
        @XmlAttribute(name = "\u0418\u0434\u0411\u0443\u043c\u0430\u0433\u0438", required = true)
        protected String идБумаги;

        /**
         * Gets the value of the организация property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.ЦенныеБумаги.Организация }
         *     
         */
        public Персона.ЦенныеБумаги.Организация getОрганизация() {
            return организация;
        }

        /**
         * Sets the value of the организация property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.ЦенныеБумаги.Организация }
         *     
         */
        public void setОрганизация(Персона.ЦенныеБумаги.Организация value) {
            this.организация = value;
        }

        /**
         * Gets the value of the бумага property.
         * 
         * @return
         *     possible object is
         *     {@link Персона.ЦенныеБумаги.Бумага }
         *     
         */
        public Персона.ЦенныеБумаги.Бумага getБумага() {
            return бумага;
        }

        /**
         * Sets the value of the бумага property.
         * 
         * @param value
         *     allowed object is
         *     {@link Персона.ЦенныеБумаги.Бумага }
         *     
         */
        public void setБумага(Персона.ЦенныеБумаги.Бумага value) {
            this.бумага = value;
        }

        /**
         * Gets the value of the идБумаги property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getИдБумаги() {
            return идБумаги;
        }

        /**
         * Sets the value of the идБумаги property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setИдБумаги(String value) {
            this.идБумаги = value;
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
         *       &lt;attribute name="КодТипБум" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КодИдент" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КодКласс" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КодВидБум" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КодКатег" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Колво" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
         *       &lt;attribute name="КолвоЧисл" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
         *       &lt;attribute name="КолвоЗнам" use="required" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}Number" />
         *       &lt;attribute name="Стоимость" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
         *       &lt;attribute name="ДатаСведОтв" type="{http://www.id-sys.ru/schemas/idbank/cik/2017/0.01/}ДатаТип" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Бумага {

            @XmlAttribute(name = "\u041a\u043e\u0434\u0422\u0438\u043f\u0411\u0443\u043c", required = true)
            protected String кодТипБум;
            @XmlAttribute(name = "\u041a\u043e\u0434\u0418\u0434\u0435\u043d\u0442", required = true)
            protected String кодИдент;
            @XmlAttribute(name = "\u041a\u043e\u0434\u041a\u043b\u0430\u0441\u0441", required = true)
            protected String кодКласс;
            @XmlAttribute(name = "\u041a\u043e\u0434\u0412\u0438\u0434\u0411\u0443\u043c", required = true)
            protected String кодВидБум;
            @XmlAttribute(name = "\u041a\u043e\u0434\u041a\u0430\u0442\u0435\u0433", required = true)
            protected String кодКатег;
            @XmlAttribute(name = "\u041a\u043e\u043b\u0432\u043e", required = true)
            protected String колво;
            @XmlAttribute(name = "\u041a\u043e\u043b\u0432\u043e\u0427\u0438\u0441\u043b", required = true)
            protected String колвоЧисл;
            @XmlAttribute(name = "\u041a\u043e\u043b\u0432\u043e\u0417\u043d\u0430\u043c", required = true)
            protected String колвоЗнам;
            @XmlAttribute(name = "\u0421\u0442\u043e\u0438\u043c\u043e\u0441\u0442\u044c", required = true)
            protected BigDecimal стоимость;
            @XmlAttribute(name = "\u0414\u0430\u0442\u0430\u0421\u0432\u0435\u0434\u041e\u0442\u0432")
            protected String датаСведОтв;

            /**
             * Gets the value of the кодТипБум property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодТипБум() {
                return кодТипБум;
            }

            /**
             * Sets the value of the кодТипБум property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодТипБум(String value) {
                this.кодТипБум = value;
            }

            /**
             * Gets the value of the кодИдент property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодИдент() {
                return кодИдент;
            }

            /**
             * Sets the value of the кодИдент property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодИдент(String value) {
                this.кодИдент = value;
            }

            /**
             * Gets the value of the кодКласс property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодКласс() {
                return кодКласс;
            }

            /**
             * Sets the value of the кодКласс property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодКласс(String value) {
                this.кодКласс = value;
            }

            /**
             * Gets the value of the кодВидБум property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодВидБум() {
                return кодВидБум;
            }

            /**
             * Sets the value of the кодВидБум property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодВидБум(String value) {
                this.кодВидБум = value;
            }

            /**
             * Gets the value of the кодКатег property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодКатег() {
                return кодКатег;
            }

            /**
             * Sets the value of the кодКатег property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодКатег(String value) {
                this.кодКатег = value;
            }

            /**
             * Gets the value of the колво property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКолво() {
                return колво;
            }

            /**
             * Sets the value of the колво property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКолво(String value) {
                this.колво = value;
            }

            /**
             * Gets the value of the колвоЧисл property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКолвоЧисл() {
                return колвоЧисл;
            }

            /**
             * Sets the value of the колвоЧисл property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКолвоЧисл(String value) {
                this.колвоЧисл = value;
            }

            /**
             * Gets the value of the колвоЗнам property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКолвоЗнам() {
                return колвоЗнам;
            }

            /**
             * Sets the value of the колвоЗнам property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКолвоЗнам(String value) {
                this.колвоЗнам = value;
            }

            /**
             * Gets the value of the стоимость property.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getСтоимость() {
                return стоимость;
            }

            /**
             * Sets the value of the стоимость property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setСтоимость(BigDecimal value) {
                this.стоимость = value;
            }

            /**
             * Gets the value of the датаСведОтв property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДатаСведОтв() {
                return датаСведОтв;
            }

            /**
             * Sets the value of the датаСведОтв property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДатаСведОтв(String value) {
                this.датаСведОтв = value;
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
         *       &lt;attribute name="Название" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ИННОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ПИФ" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Статус" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ОКСМ" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Страна" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ДоляПроцент" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ДоляЧислитель" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ДоляЗнаменатель" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КодСубОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="НеконфАдрОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="КонфАдрОрг" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Организация {

            @XmlAttribute(name = "\u041d\u0430\u0437\u0432\u0430\u043d\u0438\u0435", required = true)
            protected String название;
            @XmlAttribute(name = "\u0418\u041d\u041d\u041e\u0440\u0433", required = true)
            protected String иннОрг;
            @XmlAttribute(name = "\u041f\u0418\u0424", required = true)
            protected String пиф;
            @XmlAttribute(name = "\u0421\u0442\u0430\u0442\u0443\u0441", required = true)
            protected String статус;
            @XmlAttribute(name = "\u041e\u041a\u0421\u041c", required = true)
            protected String оксм;
            @XmlAttribute(name = "\u0421\u0442\u0440\u0430\u043d\u0430", required = true)
            protected String страна;
            @XmlAttribute(name = "\u0414\u043e\u043b\u044f\u041f\u0440\u043e\u0446\u0435\u043d\u0442", required = true)
            protected String доляПроцент;
            @XmlAttribute(name = "\u0414\u043e\u043b\u044f\u0427\u0438\u0441\u043b\u0438\u0442\u0435\u043b\u044c", required = true)
            protected String доляЧислитель;
            @XmlAttribute(name = "\u0414\u043e\u043b\u044f\u0417\u043d\u0430\u043c\u0435\u043d\u0430\u0442\u0435\u043b\u044c", required = true)
            protected String доляЗнаменатель;
            @XmlAttribute(name = "\u041a\u043e\u0434\u0421\u0443\u0431\u041e\u0440\u0433", required = true)
            protected String кодСубОрг;
            @XmlAttribute(name = "\u041d\u0435\u043a\u043e\u043d\u0444\u0410\u0434\u0440\u041e\u0440\u0433", required = true)
            protected String неконфАдрОрг;
            @XmlAttribute(name = "\u041a\u043e\u043d\u0444\u0410\u0434\u0440\u041e\u0440\u0433", required = true)
            protected String конфАдрОрг;

            /**
             * Gets the value of the название property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНазвание() {
                return название;
            }

            /**
             * Sets the value of the название property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНазвание(String value) {
                this.название = value;
            }

            /**
             * Gets the value of the иннОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getИННОрг() {
                return иннОрг;
            }

            /**
             * Sets the value of the иннОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setИННОрг(String value) {
                this.иннОрг = value;
            }

            /**
             * Gets the value of the пиф property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getПИФ() {
                return пиф;
            }

            /**
             * Sets the value of the пиф property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setПИФ(String value) {
                this.пиф = value;
            }

            /**
             * Gets the value of the статус property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСтатус() {
                return статус;
            }

            /**
             * Sets the value of the статус property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСтатус(String value) {
                this.статус = value;
            }

            /**
             * Gets the value of the оксм property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getОКСМ() {
                return оксм;
            }

            /**
             * Sets the value of the оксм property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setОКСМ(String value) {
                this.оксм = value;
            }

            /**
             * Gets the value of the страна property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getСтрана() {
                return страна;
            }

            /**
             * Sets the value of the страна property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setСтрана(String value) {
                this.страна = value;
            }

            /**
             * Gets the value of the доляПроцент property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДоляПроцент() {
                return доляПроцент;
            }

            /**
             * Sets the value of the доляПроцент property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДоляПроцент(String value) {
                this.доляПроцент = value;
            }

            /**
             * Gets the value of the доляЧислитель property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДоляЧислитель() {
                return доляЧислитель;
            }

            /**
             * Sets the value of the доляЧислитель property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДоляЧислитель(String value) {
                this.доляЧислитель = value;
            }

            /**
             * Gets the value of the доляЗнаменатель property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getДоляЗнаменатель() {
                return доляЗнаменатель;
            }

            /**
             * Sets the value of the доляЗнаменатель property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setДоляЗнаменатель(String value) {
                this.доляЗнаменатель = value;
            }

            /**
             * Gets the value of the кодСубОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКодСубОрг() {
                return кодСубОрг;
            }

            /**
             * Sets the value of the кодСубОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКодСубОрг(String value) {
                this.кодСубОрг = value;
            }

            /**
             * Gets the value of the неконфАдрОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getНеконфАдрОрг() {
                return неконфАдрОрг;
            }

            /**
             * Sets the value of the неконфАдрОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setНеконфАдрОрг(String value) {
                this.неконфАдрОрг = value;
            }

            /**
             * Gets the value of the конфАдрОрг property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getКонфАдрОрг() {
                return конфАдрОрг;
            }

            /**
             * Sets the value of the конфАдрОрг property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setКонфАдрОрг(String value) {
                this.конфАдрОрг = value;
            }

        }

    }

}
