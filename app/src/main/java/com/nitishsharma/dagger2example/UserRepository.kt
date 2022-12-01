package com.nitishsharma.dagger2example

import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor() {
    fun saveUser(email: String, password: String) {
        Log.i(TAG, "User saved to DB")
    }
}