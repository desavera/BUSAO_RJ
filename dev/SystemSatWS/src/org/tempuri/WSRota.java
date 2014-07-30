
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WSRota complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WSRota">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id_Rota" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Nome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Sentido" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ponto" type="{http://tempuri.org/}ArrayOfWSPonto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WSRota", propOrder = {
    "idRota",
    "nome",
    "sentido",
    "ponto"
})
public class WSRota {

    @XmlElement(name = "Id_Rota")
    protected short idRota;
    @XmlElement(name = "Nome")
    protected String nome;
    @XmlElement(name = "Sentido")
    protected String sentido;
    @XmlElement(name = "Ponto")
    protected ArrayOfWSPonto ponto;

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
     * Gets the value of the sentido property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentido() {
        return sentido;
    }

    /**
     * Sets the value of the sentido property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentido(String value) {
        this.sentido = value;
    }

    /**
     * Gets the value of the ponto property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWSPonto }
     *     
     */
    public ArrayOfWSPonto getPonto() {
        return ponto;
    }

    /**
     * Sets the value of the ponto property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWSPonto }
     *     
     */
    public void setPonto(ArrayOfWSPonto value) {
        this.ponto = value;
    }

}
