package com.shakibaenur.dependencyinjection.repository

import com.shakibaenur.dependencyinjection.model.Cryptocurrency

interface CryptocurrencyRepository {
    fun getCryptoCurrency():List<Cryptocurrency>
}