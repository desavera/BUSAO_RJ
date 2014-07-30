
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
 *         &lt;element name="ListaPontosReferenciaRotaResult" type="{http://tempuri.org/}ArrayOfWSPontoReferencia" minOccurs="0"/>
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
    "listaPontosReferenciaRotaResult"
})
@XmlRootElement(name = "ListaPontosReferenciaRotaResponse")
public class ListaPontosReferenciaRotaResponse {

    @XmlElement(name = "ListaPontosReferenciaRotaResult")
    protected ArrayOfWSPontoReferencia listaPontosReferenciaRotaResult;

    /**
     * Gets the value of the listaPontosReferenciaRotaResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPontoReferencia }
     *     
     */
    public ArrayOfWSPontoReferencia getListaPontosReferenciaRotaResult() {
        return listaPontosReferenciaRotaResult;
    }

    /**
     * Sets the value of the listaPontosReferenciaRotaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPontoReferencia }
     *     
     */
    public void setListaPontosReferenciaRotaResult(ArrayOfWSPontoReferencia value) {
        this.listaPontosReferenciaRotaResult = value;
    }

}
