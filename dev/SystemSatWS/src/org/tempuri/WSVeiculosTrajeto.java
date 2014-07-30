
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSVeiculosTrajeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSVeiculosTrajeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Linha" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Id_Rota" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="QuantidadeVeiculos" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="QuantidadePontos" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="HashCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PontosRota" type="{http://tempuri.org/}ArrayOfWSPonto" minOccurs="0"/>
 *         &lt;element name="PontosReferencia" type="{http://tempuri.org/}ArrayOfWSPontoReferencia" minOccurs="0"/>
 *         &lt;element name="VeiculosProximos" type="{http://tempuri.org/}ArrayOfWSVeiculo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSVeiculosTrajeto", propOrder = {
    "idLinha",
    "idRota",
    "quantidadeVeiculos",
    "quantidadePontos",
    "hashCode",
    "pontosRota",
    "pontosReferencia",
    "veiculosProximos"
})
public class WSVeiculosTrajeto {

    @XmlElement(name = "Id_Linha")
    protected int idLinha;
    @XmlElement(name = "Id_Rota")
    protected short idRota;
    @XmlElement(name = "QuantidadeVeiculos")
    protected short quantidadeVeiculos;
    @XmlElement(name = "QuantidadePontos")
    protected short quantidadePontos;
    @XmlElement(name = "HashCode")
    protected String hashCode;
    @XmlElement(name = "PontosRota")
    protected ArrayOfWSPonto pontosRota;
    @XmlElement(name = "PontosReferencia")
    protected ArrayOfWSPontoReferencia pontosReferencia;
    @XmlElement(name = "VeiculosProximos")
    protected ArrayOfWSVeiculo veiculosProximos;

    /**
     * Gets the value of the idLinha property.
     * 
     */
    public int getIdLinha() {
        return idLinha;
    }

    /**
     * Sets the value of the idLinha property.
     * 
     */
    public void setIdLinha(int value) {
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

    /**
     * Gets the value of the pontosRota property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPonto }
     *     
     */
    public ArrayOfWSPonto getPontosRota() {
        return pontosRota;
    }

    /**
     * Sets the value of the pontosRota property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPonto }
     *     
     */
    public void setPontosRota(ArrayOfWSPonto value) {
        this.pontosRota = value;
    }

    /**
     * Gets the value of the pontosReferencia property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPontoReferencia }
     *     
     */
    public ArrayOfWSPontoReferencia getPontosReferencia() {
        return pontosReferencia;
    }

    /**
     * Sets the value of the pontosReferencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPontoReferencia }
     *     
     */
    public void setPontosReferencia(ArrayOfWSPontoReferencia value) {
        this.pontosReferencia = value;
    }

    /**
     * Gets the value of the veiculosProximos property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSVeiculo }
     *     
     */
    public ArrayOfWSVeiculo getVeiculosProximos() {
        return veiculosProximos;
    }

    /**
     * Sets the value of the veiculosProximos property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSVeiculo }
     *     
     */
    public void setVeiculosProximos(ArrayOfWSVeiculo value) {
        this.veiculosProximos = value;
    }

}
