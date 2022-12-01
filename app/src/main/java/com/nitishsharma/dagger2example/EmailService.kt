package com.nitishsharma.dagger2example

import android.util.Log

class EmailService {
    fun sendEmail(to: String, from: String, body: String) {
        Log.i(TAG, "Email sent")
    }
}