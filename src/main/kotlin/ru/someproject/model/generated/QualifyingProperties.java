
package ru.someproject.model.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SignedProperties">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SignedSignatureProperties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SigningTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SigningCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="SignaturePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="UnsignedProperties">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UnsignedSignatureProperties">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SignatureTimeStamp" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "signedProperties",
    "unsignedProperties"
})
@XmlRootElement(name = "QualifyingProperties", namespace = "http://uri.etsi.org/01903/v1.1.1#")
public class QualifyingProperties {

    @XmlElement(name = "SignedProperties", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
    protected QualifyingProperties.SignedProperties signedProperties;
    @XmlElement(name = "UnsignedProperties", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
    protected QualifyingProperties.UnsignedProperties unsignedProperties;

    /**
     * Gets the value of the signedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QualifyingProperties.SignedProperties }
     *     
     */
    public QualifyingProperties.SignedProperties getSignedProperties() {
        return signedProperties;
    }

    /**
     * Sets the value of the signedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifyingProperties.SignedProperties }
     *     
     */
    public void setSignedProperties(QualifyingProperties.SignedProperties value) {
        this.signedProperties = value;
    }

    /**
     * Gets the value of the unsignedProperties property.
     * 
     * @return
     *     possible object is
     *     {@link QualifyingProperties.UnsignedProperties }
     *     
     */
    public QualifyingProperties.UnsignedProperties getUnsignedProperties() {
        return unsignedProperties;
    }

    /**
     * Sets the value of the unsignedProperties property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifyingProperties.UnsignedProperties }
     *     
     */
    public void setUnsignedProperties(QualifyingProperties.UnsignedProperties value) {
        this.unsignedProperties = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SignedSignatureProperties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SigningTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SigningCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="SignaturePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Target" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Id" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "signedSignatureProperties"
    })
    public static class SignedProperties {

        @XmlElement(name = "SignedSignatureProperties", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
        protected QualifyingProperties.SignedProperties.SignedSignatureProperties signedSignatureProperties;
        @XmlAttribute(name = "Target", required = true)
        protected String target;
        @XmlAttribute(name = "Id", required = true)
        protected String id;

        /**
         * Gets the value of the signedSignatureProperties property.
         * 
         * @return
         *     possible object is
         *     {@link QualifyingProperties.SignedProperties.SignedSignatureProperties }
         *     
         */
        public QualifyingProperties.SignedProperties.SignedSignatureProperties getSignedSignatureProperties() {
            return signedSignatureProperties;
        }

        /**
         * Sets the value of the signedSignatureProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifyingProperties.SignedProperties.SignedSignatureProperties }
         *     
         */
        public void setSignedSignatureProperties(QualifyingProperties.SignedProperties.SignedSignatureProperties value) {
            this.signedSignatureProperties = value;
        }

        /**
         * Gets the value of the target property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            return target;
        }

        /**
         * Sets the value of the target property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SigningTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SigningCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="SignaturePolicyIdentifier" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "signingTime",
            "signingCertificate",
            "signaturePolicyIdentifier"
        })
        public static class SignedSignatureProperties {

            @XmlElement(name = "SigningTime", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
            protected String signingTime;
            @XmlElement(name = "SigningCertificate", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
            protected String signingCertificate;
            @XmlElement(name = "SignaturePolicyIdentifier", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
            protected Object signaturePolicyIdentifier;

            /**
             * Gets the value of the signingTime property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigningTime() {
                return signingTime;
            }

            /**
             * Sets the value of the signingTime property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigningTime(String value) {
                this.signingTime = value;
            }

            /**
             * Gets the value of the signingCertificate property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSigningCertificate() {
                return signingCertificate;
            }

            /**
             * Sets the value of the signingCertificate property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSigningCertificate(String value) {
                this.signingCertificate = value;
            }

            /**
             * Gets the value of the signaturePolicyIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSignaturePolicyIdentifier() {
                return signaturePolicyIdentifier;
            }

            /**
             * Sets the value of the signaturePolicyIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSignaturePolicyIdentifier(Object value) {
                this.signaturePolicyIdentifier = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="UnsignedSignatureProperties">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SignatureTimeStamp" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "unsignedSignatureProperties"
    })
    public static class UnsignedProperties {

        @XmlElement(name = "UnsignedSignatureProperties", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
        protected QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties unsignedSignatureProperties;

        /**
         * Gets the value of the unsignedSignatureProperties property.
         * 
         * @return
         *     possible object is
         *     {@link QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties }
         *     
         */
        public QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties getUnsignedSignatureProperties() {
            return unsignedSignatureProperties;
        }

        /**
         * Sets the value of the unsignedSignatureProperties property.
         * 
         * @param value
         *     allowed object is
         *     {@link QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties }
         *     
         */
        public void setUnsignedSignatureProperties(QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties value) {
            this.unsignedSignatureProperties = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="SignatureTimeStamp" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "signatureTimeStamp"
        })
        public static class UnsignedSignatureProperties {

            @XmlElement(name = "SignatureTimeStamp", namespace = "http://uri.etsi.org/01903/v1.1.1#", required = true)
            protected Object signatureTimeStamp;

            /**
             * Gets the value of the signatureTimeStamp property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getSignatureTimeStamp() {
                return signatureTimeStamp;
            }

            /**
             * Sets the value of the signatureTimeStamp property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setSignatureTimeStamp(Object value) {
                this.signatureTimeStamp = value;
            }

        }

    }

}
