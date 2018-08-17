package ru.someproject.config

import org.springframework.context.annotation.Bean
import org.springframework.oxm.jaxb.Jaxb2Marshaller
import javax.xml.bind.Marshaller

class JaxbConfiguration {

    @Bean
    fun jaxb2Marshaller(): Jaxb2Marshaller {
        val marshaller = Jaxb2Marshaller()
        marshaller.setContextPaths("ru.someproject.model.generated")
        marshaller.setMarshallerProperties(mapOf(Marshaller.JAXB_FORMATTED_OUTPUT to true))
        return marshaller
    }
}