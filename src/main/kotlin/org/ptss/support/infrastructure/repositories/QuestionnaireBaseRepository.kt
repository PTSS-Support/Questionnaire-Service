package org.ptss.support.infrastructure.repositories

import jakarta.enterprise.context.ApplicationScoped
import org.ptss.support.domain.models.Questionnaire

@ApplicationScoped
class QuestionnaireBaseRepository : BaseRepository<Questionnaire>()
