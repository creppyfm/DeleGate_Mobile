package com.creppyfm.delegate_mobile.models

data class ProjectMembers(
    var id: String,
    var role: String,
    var firstName: String,
    var lastName: String,
    var currentTasks: MutableList<String> = mutableListOf()
)
