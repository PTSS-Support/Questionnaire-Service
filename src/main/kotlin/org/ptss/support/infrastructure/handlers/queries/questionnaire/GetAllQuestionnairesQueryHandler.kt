package org.ptss.support.infrastructure.handlers.queries.questionnaire

import jakarta.enterprise.context.ApplicationScoped
import org.ptss.support.domain.interfaces.queries.IQueryHandler
import org.ptss.support.domain.interfaces.repositories.IQuestionnaireRepository
import org.ptss.support.domain.models.Questionnaire
import org.ptss.support.domain.queries.GetAllQuestionnairesQuery

@ApplicationScoped
class GetAllQuestionnairesQueryHandler(
    private val questionnaireRepository: IQuestionnaireRepository,
) : IQueryHandler<GetAllQuestionnairesQuery, List<Questionnaire>> {

    override suspend fun handleAsync(query: GetAllQuestionnairesQuery): List<Questionnaire> {
        return questionnaireRepository.getAll()
    }
}
