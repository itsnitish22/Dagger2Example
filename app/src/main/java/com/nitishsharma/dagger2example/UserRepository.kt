package com.nitishsharma.dagger2example

import android.util.Log

class UserRepository {
    fun saveUser(email: String, password: String){
        Log.i(TAG, "User saved to DB")
    }
}