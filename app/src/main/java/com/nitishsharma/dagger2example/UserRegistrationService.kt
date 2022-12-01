package com.nitishsharma.dagger2example

class UserRegistrationService {
    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email, password)
        emailService.sendEmail(email, "nitish.sharma1186@gmail.com", "User registered")
    }
}