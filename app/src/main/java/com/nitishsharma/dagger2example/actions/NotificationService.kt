package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.TAG
import javax.inject.Inject

interface NotificationService {
    fun sendEmail(to: String, from: String, body: String)
}

class EmailService @Inject constructor() : NotificationService {
    override fun sendEmail(to: String, from: String, body: String) {
        Log.i(TAG, "Email sent")
    }
}

class MsgService : NotificationService {
    override fun sendEmail(to: String, from: String, body: String) {
        Log.i(TAG, "Message sent")
    }
}