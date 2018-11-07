package com.pedromassango.architecture_bestpratice.utils

import com.pedromassango.architecture_bestpratice.data.local.MyDatabase
import com.pedromassango.architecture_bestpratice.ui.main.MainViewModel
import org.koin.android.viewmodel.ext.koin.viewModel
import org.koin.dsl.module.module

object DependencyModules {

    val appModules = module {

        factory { MyDatabase.getInstance( get()) }

        viewModel { MainViewModel( get()) }
    }
}