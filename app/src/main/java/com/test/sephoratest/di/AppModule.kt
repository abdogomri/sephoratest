package com.test.sephoratest.di

import com.test.sephoratest.shared.data.ApiInterface
import com.test.sephoratest.shared.data.ApiInterfaceContainer
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class, FragmentComponent::class)
object AppModule {

    @Provides
    fun provideOnlineApiInterface(container: ApiInterfaceContainer): ApiInterface {
        return container.provideApiInterface()
    }
}