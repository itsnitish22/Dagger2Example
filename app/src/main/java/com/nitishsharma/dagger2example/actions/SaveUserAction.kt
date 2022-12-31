package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.constants.TAG
import javax.inject.Inject

class SaveUserAction @Inject constructor() {
    fun saveUserAction(email: String, password: String) {
        Log.i(TAG, "User saved to DB")
    }
}