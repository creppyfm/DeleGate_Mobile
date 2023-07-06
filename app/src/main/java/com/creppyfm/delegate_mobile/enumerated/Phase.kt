package com.creppyfm.delegate_mobile.enumerated

enum class Phase(private val value: String) {
    NOT_STARTED("Not Started"),
    IN_PROGRESS("In Progress"),
    IN_REVIEW("In Review"),
    COMPLETED("Completed");

    override fun toString(): String {
        return value
    }
}
