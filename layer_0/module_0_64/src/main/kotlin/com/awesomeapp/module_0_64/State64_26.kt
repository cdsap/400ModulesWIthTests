package com.awesomeapp.module_0_64

sealed class State64_26 {
    data object Loading : State64_26()
    data class Success(val data: String) : State64_26()
    data class Error(val message: String) : State64_26()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}