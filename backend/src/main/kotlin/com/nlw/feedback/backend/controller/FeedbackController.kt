package com.nlw.feedback.backend.controller

import com.nlw.feedback.backend.exception.FeedbackExceptions
import com.nlw.feedback.backend.model.Feedback
import com.nlw.feedback.backend.service.FeedbackService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*

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
    fun create(@RequestBody feedback: Feedback) : ResponseEntity<Feedback> = ResponseEntity.ok(service.save(feedback));

    @PutMapping("/update/{id}")
    fun update(@PathVariable id: Long, @RequestBody feedback: Feedback): ResponseEntity<Feedback> {
        val feedbackOptional: Optional<Feedback> = service.findbyId(id)
        val toSave = feedbackOptional
                    .orElseThrow { FeedbackExceptions("Nenhum Feedback com id: ${id} encontrado na base de dados.") }
                    .copy(comment = feedback.comment, type = feedback.type, screenshot = feedback.screenshot)

        return ResponseEntity.ok(service.save(toSave))
    }
}