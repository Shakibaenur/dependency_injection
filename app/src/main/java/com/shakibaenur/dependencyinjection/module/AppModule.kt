package com.shakibaenur.dependencyinjection.module

import com.shakibaenur.dependencyinjection.repository.CryptocurrencyRepository
import com.shakibaenur.dependencyinjection.repository.CryptocurrencyRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    @Singleton
    fun provideCryptocurrencyRepository():CryptocurrencyRepository=CryptocurrencyRepositoryImpl()
}