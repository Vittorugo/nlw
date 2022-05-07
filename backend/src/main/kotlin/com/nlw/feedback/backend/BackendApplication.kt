package com.nlw.feedback.backend

import com.nlw.feedback.backend.exception.FeedbackAuthenticationException
import com.nlw.feedback.backend.exception.FeedbackExceptions
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BackendApplication

fun main(args: Array<String>) {

    println("Backend com Kotlin ❤ - Projeto Feedback da NLW.")
    try{
        runApplication<BackendApplication>(*args)

    }  catch (e: FeedbackAuthenticationException) {
        println(e.message)
        e.printStackTrace()
    }  catch (e: FeedbackExceptions) {
        println(e.message)
        e.printStackTrace()
    }  catch (e: Exception) {
        println(e.message)
        e.printStackTrace()
    }

}
