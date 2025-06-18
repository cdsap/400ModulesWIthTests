package com.awesomeapp.module_2_228

sealed class State228_26 {
    data object Loading : State228_26()
    data class Success(val data: String) : State228_26()
    data class Error(val message: String) : State228_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}