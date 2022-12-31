package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.actions.EmailService
import com.nitishsharma.dagger2example.actions.MessageService
import com.nitishsharma.dagger2example.actions.SendNotificationAction
import com.nitishsharma.dagger2example.qualifiers.MessageNotificationQualifier
import dagger.Module
import dagger.Provides
import javax.inject.Named
import javax.inject.Singleton

@Module
class NotificationServiceModule() {

    @Named("email")
    @Provides
    fun sendNotificationByEmail(emailService: EmailService): SendNotificationAction {
        return emailService
    }

    @MessageNotificationQualifier
    @Provides
    fun sendNotificationByMessage(countryCode: String): SendNotificationAction {
        return MessageService(countryCode = countryCode)
    }

}