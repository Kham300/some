package ru.someproject.service.impl

import org.springframework.oxm.jaxb.Jaxb2Marshaller
import ru.someproject.service.MessageObjectService
import java.io.InputStream

class MessageObjectServiceImpl(private val messageObjectDao: MessageObjectDao,
                               private val musrshaller: Jaxb2Marshaller):MessageObjectService {
    override fun create(messageObject: MessageObject): MessageObject {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun update(passportObject: MessageObject): MessageObject {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAll(): List<MessageObject> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unmarshall(xml: String): MessageObject? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun unmarshall(xml: InputStream): MessageObject? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}