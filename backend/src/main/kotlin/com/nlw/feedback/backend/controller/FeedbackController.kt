package com.nlw.feedback.backend.controller

import com.nlw.feedback.backend.model.Feedback
import com.nlw.feedback.backend.service.FeedbackService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@CrossOrigin("http://localhost:3000/")
@RestController
@RequestMapping("/feedbacks")
class FeedbackController(val service: FeedbackService){

    @GetMapping("/list")
    fun listar(): MutableList<Feedback> {
        val result: MutableList<Feedback> = service.listar()
        return result
    }

    @PostMapping("/create")
    fun create(@RequestBody feedback: Feedback) : ResponseEntity<Feedback> = ResponseEntity.ok(service.create(feedback));   

}