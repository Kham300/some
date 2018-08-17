package ru.someproject.migration

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Service
import ru.someproject.service.impl.MessageObjectServiceImpl

@Service
class MigrationService(private val messageObjectServiceImpl: MessageObjectServiceImpl,
                       private val template: NamedParameterJdbcTemplate) {
    fun migration() {
        val query = template.query("select xml from documents.xml_from_oracle"){
            rs, _ -> rs.getBinaryStream("xml")
        }
        var count = 0
        val end = query.size
        query.forEach{
            val messageObject = messageObjectServiceImpl.unmurshall(it)
            messageObject?.let{ me ->
                messageObjectServiceImpl.create(me)
                print(me)
            } ?: print("message object was empty after mashalling")
            print("=======${end - count} till the end=========")
            count++
        }

    }

}