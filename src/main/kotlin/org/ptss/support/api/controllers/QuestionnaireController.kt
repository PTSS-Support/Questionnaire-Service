package org.ptss.support.api.controllers

import jakarta.enterprise.context.ApplicationScoped
import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType
import org.ptss.support.api.dtos.responses.QuestionnaireResponse
import org.ptss.support.core.facades.QuestionnaireFacade
import org.ptss.support.domain.interfaces.controllers.IQuestionnaireController

@Path("/questionnaires")
@ApplicationScoped
@Produces(MediaType.APPLICATION_JSON)
class QuestionnaireController(
    private val questionnaireFacade: QuestionnaireFacade,
) : IQuestionnaireController {

    @GET
    override suspend fun getAllQuestionnaires(): List<QuestionnaireResponse> =
        questionnaireFacade.getAllQuestionnaires()
}