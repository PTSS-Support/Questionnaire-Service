package org.ptss.support.core.facades

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.ptss.support.api.dtos.responses.QuestionnaireResponse
import org.ptss.support.core.mappers.QuestionnaireMapper
import org.ptss.support.core.services.QuestionnaireService

@ApplicationScoped
class QuestionnaireFacade @Inject constructor(
    private val questionnaireService: QuestionnaireService,
) {
    suspend fun getAllQuestionnaires(): List<QuestionnaireResponse> =
        questionnaireService.getAllQuestionnairesAsync()
            .map(QuestionnaireMapper::toResponse)
}