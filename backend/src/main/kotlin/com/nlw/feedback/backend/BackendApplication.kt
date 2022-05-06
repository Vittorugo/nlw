package com.nlw.feedback.backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackendApplication

fun main(args: Array<String>) {

    println("Backend com Kotlin ❤ - Projeto Feedback da NLW.")

    runApplication<BackendApplication>(*args)
}
