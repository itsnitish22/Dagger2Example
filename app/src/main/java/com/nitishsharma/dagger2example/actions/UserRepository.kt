package com.nitishsharma.dagger2example.actions

import android.util.Log
import com.nitishsharma.dagger2example.TAG
import javax.inject.Inject

interface UserRepository {
    fun saveUser(email: String, password: String)
}

class SQLRepository @Inject constructor() : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.i(TAG, "User saved to SQL")
    }
}

class FirebaseRepository : UserRepository {
    override fun saveUser(email: String, password: String) {
        Log.i(TAG, "User saved to Firebase")
    }
}

