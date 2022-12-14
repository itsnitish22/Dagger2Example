package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.actions.MsgService
import com.nitishsharma.dagger2example.actions.NotificationService
import dagger.Module
import dagger.Provides

@Module
class UserNotificationModule {

    @Provides
    fun getMsgService(): NotificationService {
        return MsgService()
    }
}