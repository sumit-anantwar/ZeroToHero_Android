package com.sumitanantwar.zerotohero_android.application

import android.app.Application
import timber.log.Timber

class App : Application() {

    // ======= Application Lifecycle =======
    override fun onCreate() {
        super.onCreate()



        // Plant a Timber Debug Tree
        Timber.plant(Timber.DebugTree())
    }
}