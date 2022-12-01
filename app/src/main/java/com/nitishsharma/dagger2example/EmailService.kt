package com.nitishsharma.dagger2example

import android.util.Log
import javax.inject.Inject

class EmailService @Inject constructor() {
    fun sendEmail(to: String, from: String, body: String) {
        Log.i(TAG, "Email sent")
    }
}