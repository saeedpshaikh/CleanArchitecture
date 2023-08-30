package com.rbs.democleanarchitecture.presentation.coin_list.components

import com.rbs.democleanarchitecture.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
