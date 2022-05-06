package com.nlw.feedback.backend.service

import com.nlw.feedback.backend.model.Feedback
import com.nlw.feedback.backend.repositories.FeedbackRepository
import org.springframework.stereotype.Service

@Service
class FeedbackService(val repository: FeedbackRepository) {

    fun listar(): MutableList<Feedback> {
        val result: MutableList<Feedback> = repository.findAll() as MutableList<Feedback>
        return result
    }

    fun create(feedback: Feedback): Feedback {
        return repository.save(feedback)
    }
}
