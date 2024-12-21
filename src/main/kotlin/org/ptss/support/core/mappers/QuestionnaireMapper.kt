package org.ptss.support.core.mappers

import org.ptss.support.api.dtos.responses.QuestionnaireResponse
import org.ptss.support.domain.models.Questionnaire

object QuestionnaireMapper {
    fun toResponse(questionnaire: Questionnaire): QuestionnaireResponse {
        return QuestionnaireResponse(
            id = questionnaire.id,
            title = questionnaire.title,
            description = questionnaire.description,
            estimatedTimeOfCompletion = questionnaire.estimatedTimeOfCompletion,
            assignedAt = questionnaire.assignedAt,
            isFinished = questionnaire.isFinished,
        )
    }
}
