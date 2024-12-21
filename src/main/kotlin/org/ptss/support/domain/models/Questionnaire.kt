package org.ptss.support.domain.models

class Questionnaire() {
    var id: String = ""
    var title: String = ""
    var description: String = ""
    var estimatedTimeOfCompletion: String = ""
    var assignedAt: String = ""
    var isFinished: Boolean = false

    constructor(
        id: String,
        title: String,
        description: String,
        estimatedTimeOfCompletion: String,
        assignedAt: String,
        isFinished: Boolean
    ) : this() {
        this.id = id
        this.title = title
        this.description = description
        this.estimatedTimeOfCompletion = estimatedTimeOfCompletion
        this.assignedAt = assignedAt
        this.isFinished = isFinished
    }
}
