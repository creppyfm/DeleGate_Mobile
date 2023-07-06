package com.creppyfm.delegate_mobile.models

import com.creppyfm.delegate_mobile.enumerated.Provider

data class User(
    var id: String,
    var token: String,
    var firstName: String,
    var lastName: String,
    var email: String,
    var provider: Provider,
    var projectIds: List<String>,
    var strengths: List<String>,
    var currentTasks: List<String> = ArrayList()
) {
    constructor() : this(
        "", "", "", "", "", Provider.NONE, listOf(), listOf(), ArrayList()
    )
}
