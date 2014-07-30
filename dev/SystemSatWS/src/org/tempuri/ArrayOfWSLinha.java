
package org.tempuri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfWSLinha complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfWSLinha">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WSLinha" type="{http://tempuri.org/}WSLinha" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfWSLinha", propOrder = {
    "wsLinha"
})
public class ArrayOfWSLinha {

    @XmlElement(name = "WSLinha", nillable = true)
    protected List<WSLinha> wsLinha;

    /**
     * Gets the value of the wsLinha property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsLinha property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWSLinha().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WSLinha }
     * 
     * 
     */
    public List<WSLinha> getWSLinha() {
        if (wsLinha == null) {
            wsLinha = new ArrayList<WSLinha>();
        }
        return this.wsLinha;
    }

}
