//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.xrd.dhl.producers.producer.dhl;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for base64BinaryType complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="base64BinaryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="href" type="{http://ws-i.org/profiles/basic/1.1/xsd}swaRef" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "base64BinaryType")
public class Base64BinaryType {

  /*
   * @XmlAttribute(name = "href")
   * 
   * @XmlAttachmentRef
   * 
   * @XmlSchemaType(name = "anyURI")
   */
  @XmlTransient
  protected DataHandler href;

  @XmlAttribute(name = "href")
  @XmlSchemaType(name = "anyURI")
  protected String hrefString;



  /**
   * Returns the hrefString.
   *
   * @return the hrefString
   */
  public String getHrefString() {
    return hrefString;
  }

  /**
   * Sets the hrefString.
   *
   * @param hrefString the hrefString to set
   */
  public void setHrefString(String hrefString) {
    this.hrefString = hrefString;
  }

  /**
   * Gets the value of the href property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public DataHandler getHref() {
    return href;
  }

  /**
   * Sets the value of the href property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setHref(DataHandler value) {
    this.href = value;
  }

}
