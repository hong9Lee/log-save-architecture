package com.hg.logpersistence

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LogPersistenceApplication

fun main(args: Array<String>) {
    runApplication<LogPersistenceApplication>(*args)
}
