
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSCliente complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSCliente">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSCliente" type="{http://tempuri.org/}WSCliente" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSCliente", propOrder = {
    "wsCliente"
})
public class ArrayOfWSCliente {

    @XmlElement(name = "WSCliente", nillable = true)
    protected List<WSCliente> wsCliente;

    /**
     * Gets the value of the wsCliente property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsCliente property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSCliente().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSCliente }
     * 
     * 
     */
    public List<WSCliente> getWSCliente() {
        if (wsCliente == null) {
            wsCliente = new ArrayList<WSCliente>();
        }
        return this.wsCliente;
    }

}
