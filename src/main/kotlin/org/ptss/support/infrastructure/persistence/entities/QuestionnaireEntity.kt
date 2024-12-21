package org.ptss.support.infrastructure.persistence.entities

import org.ptss.support.domain.models.Questionnaire

data class QuestionnaireEntity(
    val id: String,
    val title: String,
    val description: String,
    val estimatedTimeOfCompletion: String,
    val assignedAt: String,
    val isFinished: Boolean,
) {
    fun toDomain(): Questionnaire {
        return Questionnaire(
            id = id,
            title = title,
            description = description,
            estimatedTimeOfCompletion = estimatedTimeOfCompletion,
            assignedAt = assignedAt,
            isFinished = isFinished,
        )
    }
}
