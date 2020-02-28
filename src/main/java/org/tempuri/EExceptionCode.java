
package org.tempuri;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para eExceptionCode.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="eExceptionCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="NO_ERROR"/&gt;
 *     &lt;enumeration value="DB_ERROR"/&gt;
 *     &lt;enumeration value="ACCESO_NO_AUTORIZADO"/&gt;
 *     &lt;enumeration value="ERROR_INTERNO"/&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="NOT_FOUND"/&gt;
 *     &lt;enumeration value="METHOD_NO_ALLOWED"/&gt;
 *     &lt;enumeration value="UNSUPPORTED_MEDIA_TYPE"/&gt;
 *     &lt;enumeration value="BAD_REQUEST"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "eExceptionCode")
@XmlEnum
public enum EExceptionCode {

    NO_ERROR,
    DB_ERROR,
    ACCESO_NO_AUTORIZADO,
    ERROR_INTERNO,
    SUCCESS,
    NOT_FOUND,
    METHOD_NO_ALLOWED,
    UNSUPPORTED_MEDIA_TYPE,
    BAD_REQUEST;

    public String value() {
        return name();
    }

    public static EExceptionCode fromValue(String v) {
        return valueOf(v);
    }

}
