package com.nitishsharma.dagger2example.application

import android.app.Application
import com.nitishsharma.dagger2example.component.DaggerUserRegistrationComponent
import com.nitishsharma.dagger2example.component.UserRegistrationComponent

class InitialApplication : Application() {
    lateinit var userRegistrationComponent: UserRegistrationComponent

    override fun onCreate() {
        super.onCreate()

        //initialize
        userRegistrationComponent =
            DaggerUserRegistrationComponent.factory().createFactory(countryCode = "+91")
    }
}