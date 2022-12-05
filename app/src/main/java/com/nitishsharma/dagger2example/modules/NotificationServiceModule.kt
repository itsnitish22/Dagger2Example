package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.registrationservice.EmailService
import com.nitishsharma.dagger2example.registrationservice.NotificationService
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun sendNotificationUsingEmail(): NotificationService {
        return EmailService()
    }
}