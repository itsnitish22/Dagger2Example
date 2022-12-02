package com.nitishsharma.dagger2example

import dagger.Component

@Component
interface UserRegistrationComponent {

    //pass the CONSUMER as the parameter
    fun inject(mainActivity: MainActivity)
}