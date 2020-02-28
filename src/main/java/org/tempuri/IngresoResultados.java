
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ingresoResultados complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ingresoResultados"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="transmisionLISResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ingresoResultados", propOrder = {
    "transmisionLISResult"
})
public class IngresoResultados {

    protected String transmisionLISResult;

    /**
     * Obtiene el valor de la propiedad transmisionLISResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransmisionLISResult() {
        return transmisionLISResult;
    }

    /**
     * Define el valor de la propiedad transmisionLISResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransmisionLISResult(String value) {
        this.transmisionLISResult = value;
    }

}
