package com.nitishsharma.dagger2example.component

import com.nitishsharma.dagger2example.MainActivity
import com.nitishsharma.dagger2example.modules.DatabaseServiceModule
import com.nitishsharma.dagger2example.modules.NotificationServiceModule
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [DatabaseServiceModule::class, NotificationServiceModule::class])
interface UserRegistrationComponent {
    //removed because we don't want to have functions corresponding to each dependency
    //fun getUserRegistrationService(): UserRegistrationService

    //inject method will tell dagger to provide dependencies to consumer class i.e MainActivity
    fun injectDependenciesToMainActivity(mainActivity: MainActivity)

    @Component.Factory
    interface Factory {
        fun createFactory(@BindsInstance countryCode: String): UserRegistrationComponent
    }
}