package com.nitishsharma.dagger2example.services

import com.nitishsharma.dagger2example.actions.SaveUserAction
import com.nitishsharma.dagger2example.actions.SendNotificationAction
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val saveUserAction: SaveUserAction,
    private val sendNotificationAction: SendNotificationAction
) {
    fun registerUser(email: String, password: String) {
        saveUserAction.saveUserAction(email, password)
        sendNotificationAction.sendNotification(
            email,
            "nitish.sharma1186@gmail.com",
            "User registered"
        )
    }
}