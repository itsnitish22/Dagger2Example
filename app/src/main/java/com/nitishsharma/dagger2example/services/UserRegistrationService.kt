package com.nitishsharma.dagger2example.services

import com.nitishsharma.dagger2example.actions.SaveUserAction
import com.nitishsharma.dagger2example.actions.SendNotificationAction
import com.nitishsharma.dagger2example.qualifiers.MessageNotificationQualifier
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    @Named("mongodb") private val saveUserAction: SaveUserAction,
    @MessageNotificationQualifier private val sendNotificationAction: SendNotificationAction
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