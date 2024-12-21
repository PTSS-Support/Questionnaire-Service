package org.ptss.support.domain.interfaces.controllers

import jakarta.ws.rs.GET
import org.eclipse.microprofile.openapi.annotations.Operation
import org.eclipse.microprofile.openapi.annotations.media.Content
import org.eclipse.microprofile.openapi.annotations.media.Schema
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses
import org.ptss.support.api.dtos.responses.QuestionnaireResponse
import org.ptss.support.common.exceptions.ServiceError

// error 201, 400, 401, 403 and 500
interface IQuestionnaireController {
    @GET
    @Operation(summary = "Get all questionnaires", description = "Retrieves a list of all questionnaires")
    @APIResponses(
        APIResponse(
            responseCode = "201",
            description = "List of questionnaires successfully retrieved",
            content = [Content(schema = Schema(implementation = Array<QuestionnaireResponse>::class))],
        ),
        APIResponse(
            responseCode = "400",
            description = "Bad request",
            content = [Content(schema = Schema(implementation = ServiceError::class))],
        ),
        APIResponse(
            responseCode = "401",
            description = "Unauthorized",
            content = [Content(schema = Schema(implementation = ServiceError::class))],
        ),
        APIResponse(
            responseCode = "403",
            description = "Forbidden",
            content = [Content(schema = Schema(implementation = ServiceError::class))],
        ),
        APIResponse(
            responseCode = "500",
            description = "Internal server error",
            content = [Content(schema = Schema(implementation = ServiceError::class))],
        ),
    )
    suspend fun getAllQuestionnaires(): List<QuestionnaireResponse>
}
