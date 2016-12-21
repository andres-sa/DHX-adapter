//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.11
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2016.11.17 at 11:49:24 AM EET
//


package ee.ria.dhx.server.types.ee.riik.schemas.dhl_meta_automatic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each Java content interface and Java element interface
 * generated in the ee.riik.schemas.dhl_meta_automatic package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the Java representation
 * for XML content. The Java representation of XML content can consist of schema derived interfaces
 * and classes representing the binding of schema type definitions, element declarations and model
 * groups. Factory methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

  private final static QName _DhlId_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_id");
  private final static QName _DhlSaabumisviis_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saabumisviis");
  private final static QName _DhlSaabumisaeg_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saabumisaeg");
  private final static QName _DhlSaatmisviis_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saatmisviis");
  private final static QName _DhlSaatmisaeg_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saatmisaeg");
  private final static QName _DhlSaatjaAsutuseNr_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saatja_asutuse_nr");
  private final static QName _DhlSaatjaAsutuseNimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saatja_asutuse_nimi");
  private final static QName _DhlSaatjaIsikukood_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saatja_isikukood");
  private final static QName _DhlSaajaAsutuseNr_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saaja_asutuse_nr");
  private final static QName _DhlSaajaAsutuseNimi_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saaja_asutuse_nimi");
  private final static QName _DhlSaajaIsikukood_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saaja_isikukood");
  private final static QName _DhlSaatjaEpost_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saatja_epost");
  private final static QName _DhlSaajaEpost_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_saaja_epost");
  private final static QName _DhlKaust_QNAME = new QName(
      "http://www.riik.ee/schemas/dhl-meta-automatic", "dhl_kaust");

  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes
   * for package: ee.riik.schemas.dhl_meta_automatic
   * 
   */
  public ObjectFactory() {}

  /**
   * Create an instance of {@link DhlEmailHeader }
   * 
   * @return {@link DhlEmailHeader}
   */
  public DhlEmailHeader createDhlEmailHeader() {
    return new DhlEmailHeader();
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_id")
  public JAXBElement<String> createDhlId(String value) {
    return new JAXBElement<String>(_DhlId_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saabumisviis")
  public JAXBElement<String> createDhlSaabumisviis(String value) {
    return new JAXBElement<String>(_DhlSaabumisviis_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saabumisaeg")
  public JAXBElement<XMLGregorianCalendar> createDhlSaabumisaeg(XMLGregorianCalendar value) {
    return new JAXBElement<XMLGregorianCalendar>(_DhlSaabumisaeg_QNAME,
        XMLGregorianCalendar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   * 
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saatmisviis")
  public JAXBElement<String> createDhlSaatmisviis(String value) {
    return new JAXBElement<String>(_DhlSaatmisviis_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saatmisaeg")
  public JAXBElement<XMLGregorianCalendar> createDhlSaatmisaeg(XMLGregorianCalendar value) {
    return new JAXBElement<XMLGregorianCalendar>(_DhlSaatmisaeg_QNAME,
        XMLGregorianCalendar.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saatja_asutuse_nr")
  public JAXBElement<String> createDhlSaatjaAsutuseNr(String value) {
    return new JAXBElement<String>(_DhlSaatjaAsutuseNr_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   * 
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saatja_asutuse_nimi")
  public JAXBElement<String> createDhlSaatjaAsutuseNimi(String value) {
    return new JAXBElement<String>(_DhlSaatjaAsutuseNimi_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   * 
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saatja_isikukood")
  public JAXBElement<String> createDhlSaatjaIsikukood(String value) {
    return new JAXBElement<String>(_DhlSaatjaIsikukood_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saaja_asutuse_nr")
  public JAXBElement<String> createDhlSaajaAsutuseNr(String value) {
    return new JAXBElement<String>(_DhlSaajaAsutuseNr_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saaja_asutuse_nimi")
  public JAXBElement<String> createDhlSaajaAsutuseNimi(String value) {
    return new JAXBElement<String>(_DhlSaajaAsutuseNimi_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saaja_isikukood")
  public JAXBElement<String> createDhlSaajaIsikukood(String value) {
    return new JAXBElement<String>(_DhlSaajaIsikukood_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saatja_epost")
  public JAXBElement<String> createDhlSaatjaEpost(String value) {
    return new JAXBElement<String>(_DhlSaatjaEpost_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_saaja_epost")
  public JAXBElement<String> createDhlSaajaEpost(String value) {
    return new JAXBElement<String>(_DhlSaajaEpost_QNAME, String.class, null, value);
  }

  /**
   * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
   * 
   * @param value value
   * @return {@link JAXBElement}
   */
  @XmlElementDecl(namespace = "http://www.riik.ee/schemas/dhl-meta-automatic", name = "dhl_kaust")
  public JAXBElement<String> createDhlKaust(String value) {
    return new JAXBElement<String>(_DhlKaust_QNAME, String.class, null, value);
  }

}
