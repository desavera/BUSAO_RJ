
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
 *         &lt;element name="Id_Linha" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Id_Rota" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="QuantidadeVeiculos" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="QuantidadePontos" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HashCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "idLinha",
    "idRota",
    "latitude",
    "longitude",
    "quantidadeVeiculos",
    "quantidadePontos",
    "hashCode"
})
@XmlRootElement(name = "ListaVeiculosTrajeto")
public class ListaVeiculosTrajeto {

    @XmlElement(name = "Id_Config")
    protected int idConfig;
    @XmlElement(name = "Id_Linha")
    protected short idLinha;
    @XmlElement(name = "Id_Rota")
    protected short idRota;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "QuantidadeVeiculos")
    protected short quantidadeVeiculos;
    @XmlElement(name = "QuantidadePontos")
    protected short quantidadePontos;
    @XmlElement(name = "HashCode")
    protected String hashCode;

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
     * Gets the value of the idLinha property.
     * 
     */
    public short getIdLinha() {
        return idLinha;
    }

    /**
     * Sets the value of the idLinha property.
     * 
     */
    public void setIdLinha(short value) {
        this.idLinha = value;
    }

    /**
     * Gets the value of the idRota property.
     * 
     */
    public short getIdRota() {
        return idRota;
    }

    /**
     * Sets the value of the idRota property.
     * 
     */
    public void setIdRota(short value) {
        this.idRota = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the quantidadeVeiculos property.
     * 
     */
    public short getQuantidadeVeiculos() {
        return quantidadeVeiculos;
    }

    /**
     * Sets the value of the quantidadeVeiculos property.
     * 
     */
    public void setQuantidadeVeiculos(short value) {
        this.quantidadeVeiculos = value;
    }

    /**
     * Gets the value of the quantidadePontos property.
     * 
     */
    public short getQuantidadePontos() {
        return quantidadePontos;
    }

    /**
     * Sets the value of the quantidadePontos property.
     * 
     */
    public void setQuantidadePontos(short value) {
        this.quantidadePontos = value;
    }

    /**
     * Gets the value of the hashCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHashCode() {
        return hashCode;
    }

    /**
     * Sets the value of the hashCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHashCode(String value) {
        this.hashCode = value;
    }

}
