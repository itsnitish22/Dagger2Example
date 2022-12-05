package com.nitishsharma.dagger2example.component

import com.nitishsharma.dagger2example.MainActivity
import com.nitishsharma.dagger2example.modules.NotificationServiceModule
import com.nitishsharma.dagger2example.modules.UserRepositoryModule
import dagger.Component

@Component(modules = [UserRepositoryModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    //pass the CONSUMER as the parameter
    fun inject(mainActivity: MainActivity)
}

