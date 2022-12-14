package com.nitishsharma.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nitishsharma.dagger2example.component.DaggerUserRegistrationComponent
import com.nitishsharma.dagger2example.services.UserRegistrationService
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component =
            DaggerUserRegistrationComponent.builder().build()
        component.inject(this) //call inject function

        userRegistrationService.registerUser("20bcs4122@cuchd.in", "hsitiN")
    }
}
/*
we tell two things to dagger:
1. how to create an object
2. places where we're going to consume the object
 */