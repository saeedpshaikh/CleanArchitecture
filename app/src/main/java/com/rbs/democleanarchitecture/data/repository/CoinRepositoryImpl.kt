package com.rbs.democleanarchitecture.data.repository


import com.rbs.democleanarchitecture.data.remote.CoinPaprikaApi
import com.rbs.democleanarchitecture.data.remote.dto.CoinDetailDto
import com.rbs.democleanarchitecture.data.remote.dto.CoinDto
import com.rbs.democleanarchitecture.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
) : CoinRepository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}