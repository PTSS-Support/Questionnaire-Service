package org.ptss.support.core.services

import jakarta.enterprise.context.ApplicationScoped
import org.ptss.support.domain.models.Questionnaire
import org.ptss.support.domain.queries.GetAllQuestionnairesQuery
import org.ptss.support.infrastructure.handlers.queries.questionnaire.GetAllQuestionnairesQueryHandler
import org.ptss.support.infrastructure.util.executeWithExceptionLoggingAsync
import org.slf4j.LoggerFactory

@ApplicationScoped
class QuestionnaireService(
    private val getAllQuestionnairesQueryHandler: GetAllQuestionnairesQueryHandler,
) {
    private val logger = LoggerFactory.getLogger(QuestionnaireService::class.java)

    suspend fun getAllQuestionnairesAsync(): List<Questionnaire> {
        return logger.executeWithExceptionLoggingAsync(
            operation = { getAllQuestionnairesQueryHandler.handleAsync(GetAllQuestionnairesQuery()) },
            logMessage = "Failed to get all questionnaires"
        )
    }
}
