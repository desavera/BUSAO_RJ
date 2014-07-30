
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="ListaRotasLinhaResult" type="{http://tempuri.org/}ArrayOfWSRota" minOccurs="0"/>
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
    "listaRotasLinhaResult"
})
@XmlRootElement(name = "ListaRotasLinhaResponse")
public class ListaRotasLinhaResponse {

    @XmlElement(name = "ListaRotasLinhaResult")
    protected ArrayOfWSRota listaRotasLinhaResult;

    /**
     * Gets the value of the listaRotasLinhaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSRota }
     *     
     */
    public ArrayOfWSRota getListaRotasLinhaResult() {
        return listaRotasLinhaResult;
    }

    /**
     * Sets the value of the listaRotasLinhaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSRota }
     *     
     */
    public void setListaRotasLinhaResult(ArrayOfWSRota value) {
        this.listaRotasLinhaResult = value;
    }

}
