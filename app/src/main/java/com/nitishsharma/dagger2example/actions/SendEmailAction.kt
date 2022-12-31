package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.constants.TAG

class SendEmailAction {
    fun sendEmailAction(to: String, from: String, body: String) {
        Log.i(TAG, "Email sent")
    }
}