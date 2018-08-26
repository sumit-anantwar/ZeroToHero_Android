package com.sumitanantwar.zerotohero_android.application

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import timber.log.Timber

class App : Application() {

    // ======= Application Lifecycle =======
    override fun onCreate() {
        super.onCreate()

        // Initialize Crashlytics
        Fabric.with(this, Crashlytics())

        // Plant a Timber Debug Tree
        Timber.plant(Timber.DebugTree())
    }
}