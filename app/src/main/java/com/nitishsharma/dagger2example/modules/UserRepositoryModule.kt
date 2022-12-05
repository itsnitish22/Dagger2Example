package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.registrationservice.FirebaseRepository
import com.nitishsharma.dagger2example.registrationservice.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserRepositoryModule {

    @Provides
    fun getFirebaseRepository(): UserRepository {
        return FirebaseRepository()
    }

//    @Binds
//    abstract fun getSqlRepository(sqlRepository: SQLRepository): UserRepository
}