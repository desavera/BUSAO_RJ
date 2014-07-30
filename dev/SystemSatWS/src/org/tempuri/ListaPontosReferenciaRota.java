
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
 *         &lt;element name="Id_Config" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Rota" type="{http://www.w3.org/2001/XMLSchema}short"/>
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
    "idConfig",
    "rota"
})
@XmlRootElement(name = "ListaPontosReferenciaRota")
public class ListaPontosReferenciaRota {

    @XmlElement(name = "Id_Config")
    protected int idConfig;
    @XmlElement(name = "Rota")
    protected short rota;

    /**
     * Gets the value of the idConfig property.
     * 
     */
    public int getIdConfig() {
        return idConfig;
    }

    /**
     * Sets the value of the idConfig property.
     * 
     */
    public void setIdConfig(int value) {
        this.idConfig = value;
    }

    /**
     * Gets the value of the rota property.
     * 
     */
    public short getRota() {
        return rota;
    }

    /**
     * Sets the value of the rota property.
     * 
     */
    public void setRota(short value) {
        this.rota = value;
    }

}
