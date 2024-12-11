package com.hg.logkafka

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LogKafkaApplication

fun main(args: Array<String>) {
    runApplication<LogKafkaApplication>(*args)
}
