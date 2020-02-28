
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _IngresoResultados_QNAME = new QName("http://tempuri.org/", "ingresoResultados");
    private final static QName _IngresoResultadosResponse_QNAME = new QName("http://tempuri.org/", "ingresoResultadosResponse");
    private final static QName _FCVException_QNAME = new QName("http://tempuri.org/", "FCVException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link IngresoResultados }
     * 
     */
    public IngresoResultados createIngresoResultados() {
        return new IngresoResultados();
    }

    /**
     * Create an instance of {@link IngresoResultadosResponse }
     * 
     */
    public IngresoResultadosResponse createIngresoResultadosResponse() {
        return new IngresoResultadosResponse();
    }

    /**
     * Create an instance of {@link FCVException }
     * 
     */
    public FCVException createFCVException() {
        return new FCVException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoResultados }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresoResultados }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ingresoResultados")
    public JAXBElement<IngresoResultados> createIngresoResultados(IngresoResultados value) {
        return new JAXBElement<IngresoResultados>(_IngresoResultados_QNAME, IngresoResultados.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoResultadosResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link IngresoResultadosResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ingresoResultadosResponse")
    public JAXBElement<IngresoResultadosResponse> createIngresoResultadosResponse(IngresoResultadosResponse value) {
        return new JAXBElement<IngresoResultadosResponse>(_IngresoResultadosResponse_QNAME, IngresoResultadosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FCVException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FCVException }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "FCVException")
    public JAXBElement<FCVException> createFCVException(FCVException value) {
        return new JAXBElement<FCVException>(_FCVException_QNAME, FCVException.class, null, value);
    }

}
