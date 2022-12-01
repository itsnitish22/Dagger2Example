package com.nitishsharma.dagger2example

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService(): UserRegistrationService
}