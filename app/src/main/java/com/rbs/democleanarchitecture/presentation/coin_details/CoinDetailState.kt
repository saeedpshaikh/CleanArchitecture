package com.rbs.democleanarchitecture.presentation.coin_details

import com.rbs.democleanarchitecture.domain.model.CoinDetail


data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
