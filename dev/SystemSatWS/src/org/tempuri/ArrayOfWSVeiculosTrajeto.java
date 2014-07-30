
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSVeiculosTrajeto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSVeiculosTrajeto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSVeiculosTrajeto" type="{http://tempuri.org/}WSVeiculosTrajeto" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSVeiculosTrajeto", propOrder = {
    "wsVeiculosTrajeto"
})
public class ArrayOfWSVeiculosTrajeto {

    @XmlElement(name = "WSVeiculosTrajeto", nillable = true)
    protected List<WSVeiculosTrajeto> wsVeiculosTrajeto;

    /**
     * Gets the value of the wsVeiculosTrajeto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsVeiculosTrajeto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSVeiculosTrajeto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSVeiculosTrajeto }
     * 
     * 
     */
    public List<WSVeiculosTrajeto> getWSVeiculosTrajeto() {
        if (wsVeiculosTrajeto == null) {
            wsVeiculosTrajeto = new ArrayList<WSVeiculosTrajeto>();
        }
        return this.wsVeiculosTrajeto;
    }

}
