package ru.someproject.service

import java.io.InputStream

interface MessageObjectService {
    fun create(messageObject: MessageObject): MessageObject

    fun update(passportObject: MessageObject): MessageObject

    fun getAll(): List<MessageObject>

    fun unmarshall(xml: String): MessageObject?

    fun unmarshall(xml: InputStream): MessageObject?

}