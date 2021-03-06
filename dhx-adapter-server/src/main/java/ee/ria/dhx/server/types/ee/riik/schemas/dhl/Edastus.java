//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.schemas.dhl;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element ref="{http://www.riik.ee/schemas/dhl}saaja"/&gt;
 *         &lt;element name="saadud" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="meetod"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="epost"/&gt;
 *               &lt;enumeration value="xtee"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="edastatud" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="loetud" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.riik.ee/schemas/dhl}fault" minOccurs="0"/&gt;
 *         &lt;element name="staatus"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="saatmisel"/&gt;
 *               &lt;enumeration value="saadetud"/&gt;
 *               &lt;enumeration value="katkestatud"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="vastuvotja_staatus_id" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="metaxml" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;any minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {

})
@XmlRootElement(name = "edastus")
public class Edastus {

  @XmlElement(required = true, namespace = "")
  protected AadressType saaja;
  @XmlElement(namespace = "", required = true)
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar saadud;
  @XmlElement(namespace = "", required = true)
  protected String meetod;
  @XmlElement(namespace = "")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar edastatud;
  @XmlElement(namespace = "")
  @XmlSchemaType(name = "dateTime")
  protected XMLGregorianCalendar loetud;
  protected Fault fault;
  @XmlElement(namespace = "", required = true)
  protected String staatus;
  @XmlElement(name = "vastuvotja_staatus_id", namespace = "")
  protected BigInteger vastuvotjaStaatusId;
  @XmlElement(namespace = "")
  protected Edastus.Metaxml metaxml;

  /**
   * Gets the value of the saaja property.
   * 
   * @return possible object is {@link AadressType }
   * 
   */
  public AadressType getSaaja() {
    return saaja;
  }

  /**
   * Sets the value of the saaja property.
   * 
   * @param value allowed object is {@link AadressType }
   * 
   */
  public void setSaaja(AadressType value) {
    this.saaja = value;
  }

  /**
   * Gets the value of the saadud property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getSaadud() {
    return saadud;
  }

  /**
   * Sets the value of the saadud property.
   * 
   * @param value allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setSaadud(XMLGregorianCalendar value) {
    this.saadud = value;
  }

  /**
   * Gets the value of the meetod property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getMeetod() {
    return meetod;
  }

  /**
   * Sets the value of the meetod property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setMeetod(String value) {
    this.meetod = value;
  }

  /**
   * Gets the value of the edastatud property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getEdastatud() {
    return edastatud;
  }

  /**
   * Sets the value of the edastatud property.
   * 
   * @param value allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setEdastatud(XMLGregorianCalendar value) {
    this.edastatud = value;
  }

  /**
   * Gets the value of the loetud property.
   * 
   * @return possible object is {@link XMLGregorianCalendar }
   * 
   */
  public XMLGregorianCalendar getLoetud() {
    return loetud;
  }

  /**
   * Sets the value of the loetud property.
   * 
   * @param value allowed object is {@link XMLGregorianCalendar }
   * 
   */
  public void setLoetud(XMLGregorianCalendar value) {
    this.loetud = value;
  }

  /**
   * Gets the value of the fault property.
   * 
   * @return possible object is {@link Fault }
   * 
   */
  public Fault getFault() {
    return fault;
  }

  /**
   * Sets the value of the fault property.
   * 
   * @param value allowed object is {@link Fault }
   * 
   */
  public void setFault(Fault value) {
    this.fault = value;
  }

  /**
   * Gets the value of the staatus property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getStaatus() {
    return staatus;
  }

  /**
   * Sets the value of the staatus property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setStaatus(String value) {
    this.staatus = value;
  }

  /**
   * Gets the value of the vastuvotjaStaatusId property.
   * 
   * @return possible object is {@link BigInteger }
   * 
   */
  public BigInteger getVastuvotjaStaatusId() {
    return vastuvotjaStaatusId;
  }

  /**
   * Sets the value of the vastuvotjaStaatusId property.
   * 
   * @param value allowed object is {@link BigInteger }
   * 
   */
  public void setVastuvotjaStaatusId(BigInteger value) {
    this.vastuvotjaStaatusId = value;
  }

  /**
   * Gets the value of the metaxml property.
   * 
   * @return possible object is {@link Edastus.Metaxml }
   * 
   */
  public Edastus.Metaxml getMetaxml() {
    return metaxml;
  }

  /**
   * Sets the value of the metaxml property.
   * 
   * @param value allowed object is {@link Edastus.Metaxml }
   * 
   */
  public void setMetaxml(Edastus.Metaxml value) {
    this.metaxml = value;
  }


  /**
   * <p>
   * Java class for anonymous complex type.
   * 
   * <p>
   * The following schema fragment specifies the expected content contained within this class.
   * 
   * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;any minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
   * 
   * 
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {
      "any"
  })
  public static class Metaxml {

    @XmlAnyElement(lax = true)
    protected Object any;

    /**
     * Gets the value of the any property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public Object getAny() {
      return any;
    }

    /**
     * Sets the value of the any property.
     * 
     * @param value allowed object is {@link Object }
     * 
     */
    public void setAny(Object value) {
      this.any = value;
    }

  }

}
