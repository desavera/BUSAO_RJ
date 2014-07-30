
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSVeiculo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSVeiculo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Veiculo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Distancia" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="Velocidade" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Tempo" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSVeiculo", propOrder = {
    "idVeiculo",
    "descricao",
    "latitude",
    "longitude",
    "distancia",
    "velocidade",
    "tempo"
})
public class WSVeiculo {

    @XmlElement(name = "Id_Veiculo")
    protected short idVeiculo;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Latitude")
    protected double latitude;
    @XmlElement(name = "Longitude")
    protected double longitude;
    @XmlElement(name = "Distancia")
    protected double distancia;
    @XmlElement(name = "Velocidade")
    protected int velocidade;
    @XmlElement(name = "Tempo")
    protected double tempo;

    /**
     * Gets the value of the idVeiculo property.
     * 
     */
    public short getIdVeiculo() {
        return idVeiculo;
    }

    /**
     * Sets the value of the idVeiculo property.
     * 
     */
    public void setIdVeiculo(short value) {
        this.idVeiculo = value;
    }

    /**
     * Gets the value of the descricao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Sets the value of the descricao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricao(String value) {
        this.descricao = value;
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
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Sets the value of the distancia property.
     * 
     */
    public void setDistancia(double value) {
        this.distancia = value;
    }

    /**
     * Gets the value of the velocidade property.
     * 
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * Sets the value of the velocidade property.
     * 
     */
    public void setVelocidade(int value) {
        this.velocidade = value;
    }

    /**
     * Gets the value of the tempo property.
     * 
     */
    public double getTempo() {
        return tempo;
    }

    /**
     * Sets the value of the tempo property.
     * 
     */
    public void setTempo(double value) {
        this.tempo = value;
    }

}
