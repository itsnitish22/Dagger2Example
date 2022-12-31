package com.nitishsharma.dagger2example.modules

import com.nitishsharma.dagger2example.actions.SaveUserAction
import com.nitishsharma.dagger2example.actions.SaveUserToFirebase
import dagger.Binds
import dagger.Module

@Module
abstract class DatabaseServiceModule {

    @Binds
    abstract fun saveUserToFirebase(saveUserToFirebase: SaveUserToFirebase): SaveUserAction
}