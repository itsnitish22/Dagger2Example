package com.nitishsharma.dagger2example.component

import com.nitishsharma.dagger2example.services.UserRegistrationService
import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
}