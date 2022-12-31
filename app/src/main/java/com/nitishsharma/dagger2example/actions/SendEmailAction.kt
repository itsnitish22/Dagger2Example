package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.constants.TAG
import javax.inject.Inject

class SendEmailAction @Inject constructor() {
    fun sendEmailAction(to: String, from: String, body: String) {
        Log.i(TAG, "Email sent")
    }
}