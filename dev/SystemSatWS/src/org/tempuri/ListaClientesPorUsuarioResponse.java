
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
 *         &lt;element name="ListaClientesPorUsuarioResult" type="{http://tempuri.org/}ArrayOfWSCliente" minOccurs="0"/>
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
    "listaClientesPorUsuarioResult"
})
@XmlRootElement(name = "ListaClientesPorUsuarioResponse")
public class ListaClientesPorUsuarioResponse {

    @XmlElement(name = "ListaClientesPorUsuarioResult")
    protected ArrayOfWSCliente listaClientesPorUsuarioResult;

    /**
     * Gets the value of the listaClientesPorUsuarioResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSCliente }
     *     
     */
    public ArrayOfWSCliente getListaClientesPorUsuarioResult() {
        return listaClientesPorUsuarioResult;
    }

    /**
     * Sets the value of the listaClientesPorUsuarioResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSCliente }
     *     
     */
    public void setListaClientesPorUsuarioResult(ArrayOfWSCliente value) {
        this.listaClientesPorUsuarioResult = value;
    }

}
