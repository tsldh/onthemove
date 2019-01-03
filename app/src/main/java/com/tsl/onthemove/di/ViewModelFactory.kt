package com.tsl.onthemove.di

import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(private val activity: FragmentActivity?): ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        throw IllegalArgumentException("Unknown ViewModel class")

    }
}