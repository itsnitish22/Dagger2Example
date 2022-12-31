package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.actions.MessageService
import com.nitishsharma.dagger2example.actions.SendNotificationAction
import dagger.Module
import dagger.Provides

@Module
class NotificationServiceModule {

    @Provides
    fun sendNotificationByMessage(): SendNotificationAction {
        return MessageService()
    }
}