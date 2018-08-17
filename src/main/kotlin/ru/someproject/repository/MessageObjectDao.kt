package ru.someproject.repository

import org.springframework.data.repository.CrudRepository

interface MessageObjectDao : CrudRepository<MessageObject, > {
}