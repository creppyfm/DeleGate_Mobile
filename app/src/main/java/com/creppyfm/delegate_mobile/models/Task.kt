package com.creppyfm.delegate_mobile.models

import com.creppyfm.delegate_mobile.enumerated.Phase
import java.time.LocalDateTime

data class Task(
    var id: String? = null,
    var stepId: String,
    var projectId: String? = null,
    var title: String,
    var description: String,
    var generation: Int,
    var weight: Int,
    var phase: Phase,
    var created: LocalDateTime,
    var updated: LocalDateTime,
    var assignedUsers: MutableList<String> = mutableListOf()
)
