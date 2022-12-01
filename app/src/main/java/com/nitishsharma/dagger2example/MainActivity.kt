package com.nitishsharma.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService = UserRegistrationService()
        userRegistrationService.registerUser("20bcs4122@cuchd.in", "hsitiN")
    }
}