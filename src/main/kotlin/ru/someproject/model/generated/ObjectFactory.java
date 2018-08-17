
package ru.someproject.model.generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.someproject.model.generated package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.someproject.model.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QualifyingProperties }
     * 
     */
    public QualifyingProperties createQualifyingProperties() {
        return new QualifyingProperties();
    }

    /**
     * Create an instance of {@link QualifyingProperties.UnsignedProperties }
     * 
     */
    public QualifyingProperties.UnsignedProperties createQualifyingPropertiesUnsignedProperties() {
        return new QualifyingProperties.UnsignedProperties();
    }

    /**
     * Create an instance of {@link QualifyingProperties.SignedProperties }
     * 
     */
    public QualifyingProperties.SignedProperties createQualifyingPropertiesSignedProperties() {
        return new QualifyingProperties.SignedProperties();
    }

    /**
     * Create an instance of {@link QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties }
     * 
     */
    public QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties createQualifyingPropertiesUnsignedPropertiesUnsignedSignatureProperties() {
        return new QualifyingProperties.UnsignedProperties.UnsignedSignatureProperties();
    }

    /**
     * Create an instance of {@link QualifyingProperties.SignedProperties.SignedSignatureProperties }
     * 
     */
    public QualifyingProperties.SignedProperties.SignedSignatureProperties createQualifyingPropertiesSignedPropertiesSignedSignatureProperties() {
        return new QualifyingProperties.SignedProperties.SignedSignatureProperties();
    }

}
