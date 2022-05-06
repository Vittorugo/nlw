package com.nlw.feedback.backend.controller

import com.nlw.feedback.backend.model.Feedback
import com.nlw.feedback.backend.service.FeedbackService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/feedbacks")
class FeedbackController(val service: FeedbackService){

    @GetMapping("/list")
    fun listar(): MutableList<Feedback> {
        val result: MutableList<Feedback> = service.listar()
        return result
    }

    @PostMapping("/create")
    fun create(@RequestBody feedback: Feedback) : ResponseEntity<Feedback>{
        val new_feedback: Feedback = service.create(feedback)
        return ResponseEntity.ok(feedback);
    }

}