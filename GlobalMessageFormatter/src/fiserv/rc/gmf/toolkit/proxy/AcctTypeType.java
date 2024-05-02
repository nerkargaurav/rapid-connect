//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AcctTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AcctTypeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Max6AN">
 *     &lt;enumeration value="Debit"/>
 *     &lt;enumeration value="Credit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AcctTypeType")
@XmlEnum
public enum AcctTypeType {

    @XmlEnumValue("Debit")
    DEBIT("Debit"),
    @XmlEnumValue("Credit")
    CREDIT("Credit");
    private final String value;

    AcctTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AcctTypeType fromValue(String v) {
        for (AcctTypeType c: AcctTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
