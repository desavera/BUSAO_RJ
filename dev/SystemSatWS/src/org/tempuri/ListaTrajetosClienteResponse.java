
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
 *         &lt;element name="ListaTrajetosClienteResult" type="{http://tempuri.org/}ArrayOfWSTrajeto" minOccurs="0"/>
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
    "listaTrajetosClienteResult"
})
@XmlRootElement(name = "ListaTrajetosClienteResponse")
public class ListaTrajetosClienteResponse {

    @XmlElement(name = "ListaTrajetosClienteResult")
    protected ArrayOfWSTrajeto listaTrajetosClienteResult;

    /**
     * Gets the value of the listaTrajetosClienteResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSTrajeto }
     *     
     */
    public ArrayOfWSTrajeto getListaTrajetosClienteResult() {
        return listaTrajetosClienteResult;
    }

    /**
     * Sets the value of the listaTrajetosClienteResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSTrajeto }
     *     
     */
    public void setListaTrajetosClienteResult(ArrayOfWSTrajeto value) {
        this.listaTrajetosClienteResult = value;
    }

}
