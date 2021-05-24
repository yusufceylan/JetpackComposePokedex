package com.ysfcyln.jetpackcomposepokedex

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

/**
 * Core Application Class
 */
@HiltAndroidApp
class PokedexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}