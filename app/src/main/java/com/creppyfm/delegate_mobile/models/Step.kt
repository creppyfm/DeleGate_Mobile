package com.creppyfm.delegate_mobile.models

data class Step(
    var id: String,
    var projectId: String,
    var title: String,
    var description: String,
    var taskList: MutableList<String> = mutableListOf()
)