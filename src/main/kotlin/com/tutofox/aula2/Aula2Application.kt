package com.tutofox.aula2

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableFeignClients
class Aula2Application

fun main(args: Array<String>) {
	runApplication<Aula2Application>(*args)
}
