package com.nitishsharma.dagger2example.registrationservice

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.sendEmail(email, "nitish.sharma1186@gmail.com", "User registered")
    }
}