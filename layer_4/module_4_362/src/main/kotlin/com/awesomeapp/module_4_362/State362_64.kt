package com.awesomeapp.module_4_362

sealed class State362_64 {
    data object Loading : State362_64()
    data class Success(val data: String) : State362_64()
    data class Error(val message: String) : State362_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}