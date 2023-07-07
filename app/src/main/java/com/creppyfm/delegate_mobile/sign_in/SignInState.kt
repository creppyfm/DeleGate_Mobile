package com.creppyfm.delegate_mobile.sign_in

data class SignInState(
    val successfulSignIn: Boolean = false,
    val signInError: String? = null
)
