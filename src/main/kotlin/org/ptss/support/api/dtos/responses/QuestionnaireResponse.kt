package org.ptss.support.api.dtos.responses

data class QuestionnaireResponse(
    val id: String,
    val title: String,
    val description: String,
    val estimatedTimeOfCompletion: String,
    val assignedAt: String,
    val isFinished: Boolean,
)
