package org.ptss.support.infrastructure.repositories

import jakarta.enterprise.context.ApplicationScoped
import jakarta.inject.Inject
import org.ptss.support.domain.interfaces.repositories.IQuestionnaireRepository
import org.ptss.support.domain.models.Questionnaire
import org.ptss.support.infrastructure.persistence.entities.QuestionnaireEntity

@ApplicationScoped
class QuestionnaireRepository @Inject constructor(
    private val questionnaireBaseRepository: QuestionnaireBaseRepository
) : IQuestionnaireRepository {
    override fun getAll(): List<Questionnaire> {
        return questionnaireBaseRepository.useConnection { connection ->
            val questionnaires = mutableListOf<Questionnaire>()
            val query =
                "SELECT id, title, description, estimatedTimeOfCompletion, assignedAt, isFinished FROM questionnaires"

            val result = connection.prepareStatement(query).executeQuery()

            while (result.next()) {
                val questionnaire = QuestionnaireEntity(
                    id = result.getString("id"),
                    title = result.getString("title"),
                    description = result.getString("description"),
                    estimatedTimeOfCompletion = result.getString("estimatedTimeOfCompletion"),
                    assignedAt = result.getString("assignedAt"),
                    isFinished = result.getBoolean("isFinished"),
                ).toDomain()
                questionnaires.add(questionnaire)
            }

            questionnaires
        }
    }
}
