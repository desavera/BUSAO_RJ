
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
 *         &lt;element name="ListaVeiculosProximosResult" type="{http://tempuri.org/}ArrayOfWSVeiculo" minOccurs="0"/>
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
    "listaVeiculosProximosResult"
})
@XmlRootElement(name = "ListaVeiculosProximosResponse")
public class ListaVeiculosProximosResponse {

    @XmlElement(name = "ListaVeiculosProximosResult")
    protected ArrayOfWSVeiculo listaVeiculosProximosResult;

    /**
     * Gets the value of the listaVeiculosProximosResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSVeiculo }
     *     
     */
    public ArrayOfWSVeiculo getListaVeiculosProximosResult() {
        return listaVeiculosProximosResult;
    }

    /**
     * Sets the value of the listaVeiculosProximosResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSVeiculo }
     *     
     */
    public void setListaVeiculosProximosResult(ArrayOfWSVeiculo value) {
        this.listaVeiculosProximosResult = value;
    }

}
