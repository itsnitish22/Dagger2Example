package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.actions.SaveUserAction
import com.nitishsharma.dagger2example.actions.SaveUserToFirebase
import com.nitishsharma.dagger2example.actions.SaveUserToMongoDB
import dagger.Binds
import dagger.Module
import javax.inject.Named
import javax.inject.Singleton

@Module
abstract class DatabaseServiceModule {

    @Singleton
    @Named("firebase")
    @Binds
    abstract fun saveUserToFirebase(saveUserToFirebase: SaveUserToFirebase): SaveUserAction

    @Named("mongodb")
    @Binds
    abstract fun saveUserToMongoDB(saveUserToMongoDB: SaveUserToMongoDB): SaveUserAction
}