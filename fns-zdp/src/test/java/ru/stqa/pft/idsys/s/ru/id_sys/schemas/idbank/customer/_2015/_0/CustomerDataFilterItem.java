
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.customer._2015._0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import ru.stqa.pft.idsys.model.LookupCustomersRqData;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.DateTimeRange;
import ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.common._2012._0.Object;


/**
 * Ёлемент фильтра сведений о клиенте
 * 
 * <p>Java class for CustomerDataFilterItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CustomerDataFilterItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}Object">
 *       &lt;sequence>
 *         &lt;element name="TimeFilter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Range" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}DateTimeRange"/>
 *                   &lt;element name="Unread" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *                 &lt;/choice>
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
@XmlType(name = "CustomerDataFilterItem", propOrder = {
    "timeFilter"
})
public class CustomerDataFilterItem
    extends Object
{

    @XmlElement(name = "TimeFilter")
    protected LookupCustomersRqData timeFilter;

    /**
     * Gets the value of the timeFilter property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerDataFilterItem.TimeFilter }
     *     
     */
    public LookupCustomersRqData getTimeFilter() {
        return timeFilter;
    }

    /**
     * Sets the value of the timeFilter property.
     *
     * @param value
     *     allowed object is
     *     {@link TimeFilter }
     *     
     */
    public void setTimeFilter(LookupCustomersRqData value) {
        this.timeFilter = value;
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
     *         &lt;element name="Range" type="{http://www.id-sys.ru/schemas/idbank/common/2012/0.01/}DateTimeRange"/>
     *         &lt;element name="Unread" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
        "range",
        "unread"
    })
    public static class TimeFilter {

        @XmlElement(name = "Range")
        protected DateTimeRange range;
        @XmlElement(name = "Unread")
        protected Boolean unread;

        /**
         * Gets the value of the range property.
         * 
         * @return
         *     possible object is
         *     {@link DateTimeRange }
         *     
         */
        public DateTimeRange getRange() {
            return range;
        }

        /**
         * Sets the value of the range property.
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeRange }
         *     
         */
        public void setRange(DateTimeRange value) {
            this.range = value;
        }

        /**
         * Gets the value of the unread property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isUnread() {
            return unread;
        }

        /**
         * Sets the value of the unread property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setUnread(Boolean value) {
            this.unread = value;
        }

    }

}
