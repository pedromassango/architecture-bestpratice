package com.pedromassango.architecture_bestpratice

import android.app.Application
import com.pedromassango.architecture_bestpratice.utils.DependencyModules
import org.koin.android.ext.android.startKoin

class MyApp: Application(){

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(
                DependencyModules.appModules
        ) )
    }
}