//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.01.27 at 03:21:12 PM EST 
//


package fiserv.rc.gmf.toolkit.proxy;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FunCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FunCodeType">
 *   &lt;restriction base="{com/fiserv/Merchant/gmfV10.02}Len1AN">
 *     &lt;enumeration value="R"/>
 *     &lt;enumeration value="D"/>
 *     &lt;enumeration value="F"/>
 *     &lt;enumeration value="U"/>
 *     &lt;enumeration value="N"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="L"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="P"/>
 *     &lt;enumeration value="X"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FunCodeType")
@XmlEnum
public enum FunCodeType {

    R,
    D,
    F,
    U,
    N,
    C,
    L,
    E,
    M,
    P,
    X;

    public String value() {
        return name();
    }

    public static FunCodeType fromValue(String v) {
        return valueOf(v);
    }

}
