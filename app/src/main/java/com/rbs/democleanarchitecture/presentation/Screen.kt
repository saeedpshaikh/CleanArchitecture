package com.rbs.democleanarchitecture.presentation

sealed class Screen(val route: String) {
    object CoinDetailScreen: Screen("coin_detail_screen")
}
