
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSLinha complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSLinha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Linha" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Id_Cliente" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="NomeCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Intervalo" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Numero" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Descricao" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Rota" type="{http://tempuri.org/}ArrayOfWSRota" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSLinha", propOrder = {
    "idLinha",
    "idCliente",
    "nomeCliente",
    "intervalo",
    "numero",
    "nome",
    "descricao",
    "rota"
})
public class WSLinha {

    @XmlElement(name = "Id_Linha")
    protected short idLinha;
    @XmlElement(name = "Id_Cliente")
    protected short idCliente;
    @XmlElement(name = "NomeCliente")
    protected String nomeCliente;
    @XmlElement(name = "Intervalo")
    protected short intervalo;
    @XmlElement(name = "Numero")
    protected String numero;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Descricao")
    protected String descricao;
    @XmlElement(name = "Rota")
    protected ArrayOfWSRota rota;

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
     * Gets the value of the idCliente property.
     * 
     */
    public short getIdCliente() {
        return idCliente;
    }

    /**
     * Sets the value of the idCliente property.
     * 
     */
    public void setIdCliente(short value) {
        this.idCliente = value;
    }

    /**
     * Gets the value of the nomeCliente property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * Sets the value of the nomeCliente property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeCliente(String value) {
        this.nomeCliente = value;
    }

    /**
     * Gets the value of the intervalo property.
     * 
     */
    public short getIntervalo() {
        return intervalo;
    }

    /**
     * Sets the value of the intervalo property.
     * 
     */
    public void setIntervalo(short value) {
        this.intervalo = value;
    }

    /**
     * Gets the value of the numero property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Sets the value of the numero property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumero(String value) {
        this.numero = value;
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
     * Gets the value of the rota property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSRota }
     *     
     */
    public ArrayOfWSRota getRota() {
        return rota;
    }

    /**
     * Sets the value of the rota property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSRota }
     *     
     */
    public void setRota(ArrayOfWSRota value) {
        this.rota = value;
    }

}
