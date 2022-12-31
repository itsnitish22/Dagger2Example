package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.constants.TAG
import javax.inject.Inject

interface SaveUserAction {
    fun saveUserAction(email: String, password: String)
}

class SaveUserToFirebase @Inject constructor() : SaveUserAction {
    override fun saveUserAction(email: String, password: String) {
        Log.i(TAG, "User saved to Firebase")
    }
}

class SaveUserToMongoDB : SaveUserAction {
    override fun saveUserAction(email: String, password: String) {
        Log.i(TAG, "User saved to Mongo DB")
    }

}