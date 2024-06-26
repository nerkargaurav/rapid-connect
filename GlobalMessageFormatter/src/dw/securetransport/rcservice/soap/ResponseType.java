//
// Generated By:JAX-WS RI IBM 2.1.6 in JDK 6 (JAXB RI IBM JAXB 2.1.10 in JDK 6)
//


package dw.securetransport.rcservice.soap;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RespClientID" type="{http://securetransport.dw/rcservice/soap}RespClientIDType"/>
 *         &lt;element name="Status" type="{http://securetransport.dw/rcservice/soap}StatusType"/>
 *         &lt;element name="TransactionResponse" type="{http://securetransport.dw/rcservice/soap}TransactionResponseType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseType", namespace = "http://securetransport.dw/rcservice/soap", propOrder = {
    "respClientID",
    "status",
    "transactionResponse"
})
public class ResponseType
    implements Serializable
{

    @XmlElement(name = "RespClientID", required = true)
    protected RespClientIDType respClientID;
    @XmlElement(name = "Status", required = true)
    protected StatusType status;
    @XmlElement(name = "TransactionResponse")
    protected TransactionResponseType transactionResponse;
    @XmlAttribute(name = "Version", required = true)
    protected String version;

    /**
     * Gets the value of the respClientID property.
     * 
     * @return
     *     possible object is
     *     {@link RespClientIDType }
     *     
     */
    public RespClientIDType getRespClientID() {
        return respClientID;
    }

    /**
     * Sets the value of the respClientID property.
     * 
     * @param value
     *     allowed object is
     *     {@link RespClientIDType }
     *     
     */
    public void setRespClientID(RespClientIDType value) {
        this.respClientID = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the transactionResponse property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionResponseType }
     *     
     */
    public TransactionResponseType getTransactionResponse() {
        return transactionResponse;
    }

    /**
     * Sets the value of the transactionResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionResponseType }
     *     
     */
    public void setTransactionResponse(TransactionResponseType value) {
        this.transactionResponse = value;
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

}
