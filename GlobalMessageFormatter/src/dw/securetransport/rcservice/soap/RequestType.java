//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package dw.securetransport.rcservice.soap;

import java.io.Serializable;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReqClientID" type="{http://securetransport.dw/rcservice/soap}ReqClientIDType"/>
 *         &lt;element name="Transaction" type="{http://securetransport.dw/rcservice/soap}TransactionType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" />
 *       &lt;attribute name="ClientTimeout">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *             &lt;minExclusive value="0"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestType", namespace = "http://securetransport.dw/rcservice/soap", propOrder = {
    "reqClientID",
    "transaction"
})
public class RequestType
    implements Serializable
{

    @XmlElement(name = "ReqClientID", required = true)
    protected ReqClientIDType reqClientID;
    @XmlElement(name = "Transaction", required = true)
    protected TransactionType transaction;
    @XmlAttribute(name = "Version", required = true)
    protected String version;
    @XmlAttribute(name = "ClientTimeout")
    protected BigInteger clientTimeout;

    /**
     * Gets the value of the reqClientID property.
     * 
     * @return
     *     possible object is
     *     {@link ReqClientIDType }
     *     
     */
    public ReqClientIDType getReqClientID() {
        return reqClientID;
    }

    /**
     * Sets the value of the reqClientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReqClientIDType }
     *     
     */
    public void setReqClientID(ReqClientIDType value) {
        this.reqClientID = value;
    }

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionType }
     *     
     */
    public TransactionType getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionType }
     *     
     */
    public void setTransaction(TransactionType value) {
        this.transaction = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "3";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the clientTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClientTimeout() {
        return clientTimeout;
    }

    /**
     * Sets the value of the clientTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClientTimeout(BigInteger value) {
        this.clientTimeout = value;
    }

}
