package com.nitishsharma.dagger2example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.nitishsharma.dagger2example.actions.SaveUserAction
import com.nitishsharma.dagger2example.actions.SendEmailAction
import com.nitishsharma.dagger2example.services.UserRegistrationService

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveUserAction = SaveUserAction()
        val sendEmailAction = SendEmailAction()

        val userRegistrationService = UserRegistrationService(saveUserAction, sendEmailAction)
        userRegistrationService.registerUser("20bcs4122@cuchd.in", "hsitiN")
    }
}