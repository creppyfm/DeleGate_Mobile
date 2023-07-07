package com.creppyfm.delegate_mobile.models

import com.creppyfm.delegate_mobile.enumerated.Phase
import java.time.LocalDateTime

data class Project(
    private var userId: String,
    var title: String,
    var description: String,
    var phase: Phase,
    var created: LocalDateTime,
    var updated: LocalDateTime,
    var id: String? = null,
    var projectMembers: MutableList<ProjectMembers> = mutableListOf(),
    var taskList: MutableList<Task> = mutableListOf(),
    var stepList: MutableList<Step> = mutableListOf()
) {
    fun getUserId(): String {
        return userId
    }

    fun setUserId(userId: String) {
        this.userId = userId
    }

    fun addProjectMember(projectMember: ProjectMembers) {
        projectMembers.add(projectMember)
    }

    fun removeProjectMemberByUserId(userId: String): Boolean {
        return projectMembers.removeIf { projectMember ->
            projectMember.id == userId
        }
    }

    fun updateProjectMemberRoleByUserId(userId: String, newRole: String): Boolean {
        for (projectMember in projectMembers) {
            if (projectMember.id == userId) {
                projectMember.role = newRole
                return true
            }
        }
        return false
    }

    fun addTask(task: Task) {
        taskList.add(task)
    }

    fun addStep(step: Step) {
        stepList.add(step)
    }
}