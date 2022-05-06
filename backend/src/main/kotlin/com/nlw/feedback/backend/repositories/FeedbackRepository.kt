package com.nlw.feedback.backend.repositories

import com.nlw.feedback.backend.model.Feedback
import org.springframework.data.repository.CrudRepository

interface FeedbackRepository : CrudRepository<Feedback, Long>{
}