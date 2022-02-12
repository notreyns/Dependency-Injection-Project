package com.example.dependencyinjectionstart.example2.di

import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionstart.example2.presentation.ExampleViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey


@Module
interface ViewModelsModule {

    @IntoMap
    @StringKey("ExampleViewModel")
    @Binds
    fun bindViewModel(viewModel: ExampleViewModel): ViewModel

}