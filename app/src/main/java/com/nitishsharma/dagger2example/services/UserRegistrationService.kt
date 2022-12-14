package com.nitishsharma.dagger2example.services

import com.nitishsharma.dagger2example.actions.NotificationService
import com.nitishsharma.dagger2example.actions.UserRepository
import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    val userRepository: UserRepository,
    val notificationService: NotificationService
) {
    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        notificationService.sendEmail(email, "nitish.sharma1186@gmail.com", "User registered")
    }
}