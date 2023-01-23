package com.example.searchfilms

import com.example.searchfilms.entities.Move

sealed class AppState {
        data class Success(val filmsData: MutableList<Move>): AppState()
        data class Error(val error: Throwable): AppState()
        object Loading: AppState()

}
