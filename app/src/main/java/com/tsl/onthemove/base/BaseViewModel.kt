package com.tsl.onthemove.base

import androidx.lifecycle.ViewModel
import com.tsl.onthemove.di.component.DaggerViewModelInjector
import com.tsl.onthemove.di.component.ViewModelInjector
import com.tsl.onthemove.di.module.NetworkModule

abstract class BaseViewModel : ViewModel(){
    private val injector: ViewModelInjector = DaggerViewModelInjector
        .builder()
        .networkModule(NetworkModule)
        .build()

    init {
        inject()
    }

    /**
     * Injects the required dependencies
     */
    private fun inject() {
        when (this) {
        }
    }
}