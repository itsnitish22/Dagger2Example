package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.constants.TAG
import javax.inject.Inject

interface SendNotificationAction {
    fun sendNotification(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : SendNotificationAction {
    override fun sendNotification(to: String, from: String, body: String) {
        Log.i(TAG, "Email Sent")
    }
}

class MessageService : SendNotificationAction {
    override fun sendNotification(to: String, from: String, body: String) {
        Log.i(TAG, "Message Sent")
    }
}