
package org.tempuri;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSPontoReferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSPontoReferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Rota" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Id_PontoReferencia" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localidade" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Distancia" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSPontoReferencia", propOrder = {
    "idRota",
    "idPontoReferencia",
    "nome",
    "localidade",
    "latitude",
    "longitude",
    "distancia"
})
public class WSPontoReferencia {

    @XmlElement(name = "Id_Rota")
    protected short idRota;
    @XmlElement(name = "Id_PontoReferencia")
    protected int idPontoReferencia;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Localidade")
    protected String localidade;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Distancia", required = true)
    protected BigDecimal distancia;

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
     * Gets the value of the idPontoReferencia property.
     * 
     */
    public int getIdPontoReferencia() {
        return idPontoReferencia;
    }

    /**
     * Sets the value of the idPontoReferencia property.
     * 
     */
    public void setIdPontoReferencia(int value) {
        this.idPontoReferencia = value;
    }

    /**
     * Gets the value of the nome property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNome() {
        return nome;
    }

    /**
     * Sets the value of the nome property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNome(String value) {
        this.nome = value;
    }

    /**
     * Gets the value of the localidade property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalidade() {
        return localidade;
    }

    /**
     * Sets the value of the localidade property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalidade(String value) {
        this.localidade = value;
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
     * Gets the value of the distancia property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDistancia() {
        return distancia;
    }

    /**
     * Sets the value of the distancia property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDistancia(BigDecimal value) {
        this.distancia = value;
    }

}
