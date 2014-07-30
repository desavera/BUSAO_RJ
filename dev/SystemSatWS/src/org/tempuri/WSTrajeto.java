
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSTrajeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSTrajeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Linha" type="{http://tempuri.org/}ArrayOfWSLinha" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSTrajeto", propOrder = {
    "linha"
})
public class WSTrajeto {

    @XmlElement(name = "Linha")
    protected ArrayOfWSLinha linha;

    /**
     * Gets the value of the linha property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSLinha }
     *     
     */
    public ArrayOfWSLinha getLinha() {
        return linha;
    }

    /**
     * Sets the value of the linha property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSLinha }
     *     
     */
    public void setLinha(ArrayOfWSLinha value) {
        this.linha = value;
    }

}
