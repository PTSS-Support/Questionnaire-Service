package org.ptss.support.domain.interfaces.repositories

import org.ptss.support.domain.models.Questionnaire

interface IQuestionnaireRepository {
    fun getAll(): List<Questionnaire>
}
