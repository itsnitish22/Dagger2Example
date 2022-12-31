package com.nitishsharma.dagger2example.services

import com.nitishsharma.dagger2example.actions.SaveUserAction
import com.nitishsharma.dagger2example.actions.SendEmailAction
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val saveUserAction: SaveUserAction,
    private val sendEmailAction: SendEmailAction
) {
    fun registerUser(email: String, password: String) {
        saveUserAction.saveUserAction(email, password)
        sendEmailAction.sendEmailAction(email, "nitish.sharma1186@gmail.com", "User registered")
    }
}