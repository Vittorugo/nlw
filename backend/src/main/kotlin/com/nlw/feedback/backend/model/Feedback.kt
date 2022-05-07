package com.nlw.feedback.backend.model

import javax.persistence.*

@Entity
@Table(name = "tb_feedbacks")
data class Feedback(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    val id: Long,
    val type: String,
    val comment: String,
    val screenshot: String?
) {
}