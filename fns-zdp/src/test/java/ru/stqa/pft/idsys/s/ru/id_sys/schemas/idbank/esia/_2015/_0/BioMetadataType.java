
package ru.stqa.pft.idsys.s.ru.id_sys.schemas.idbank.esia._2015._0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Метаданные биометрических образцов
 * 
 * <p>Java class for BioMetadataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BioMetadataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SoundSample" type="{http://www.id-sys.ru/schemas/idbank/esia/2015/0.01/}SoundSampleType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BioMetadataType", propOrder = {
    "soundSample"
})
public class BioMetadataType {

    @XmlElement(name = "SoundSample")
    protected List<SoundSampleType> soundSample;

    /**
     * Gets the value of the soundSample property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the soundSample property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSoundSample().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SoundSampleType }
     * 
     * 
     */
    public List<SoundSampleType> getSoundSample() {
        if (soundSample == null) {
            soundSample = new ArrayList<SoundSampleType>();
        }
        return this.soundSample;
    }

}
