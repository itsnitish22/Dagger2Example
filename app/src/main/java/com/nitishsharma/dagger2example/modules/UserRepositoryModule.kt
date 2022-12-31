package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.actions.FirebaseRepository
import com.nitishsharma.dagger2example.actions.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }
}