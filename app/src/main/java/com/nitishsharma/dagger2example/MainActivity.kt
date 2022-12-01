package com.nitishsharma.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userRegistrationService =
            DaggerUserRegistrationComponent.builder().build().getUserRegistrationService()
        userRegistrationService.registerUser("20bcs4122@cuchd.in", "hsitiN")
    }
}

/*
we tell two things to dagger:
1. how to create an object
2. places where we're going to consume the object
 */