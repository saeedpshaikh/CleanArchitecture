package com.rbs.democleanarchitecture.domain.repository

import com.rbs.democleanarchitecture.data.remote.dto.CoinDetailDto
import com.rbs.democleanarchitecture.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}