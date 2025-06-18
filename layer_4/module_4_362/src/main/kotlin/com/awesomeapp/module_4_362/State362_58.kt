package com.awesomeapp.module_4_362

sealed class State362_58 {
    data object Loading : State362_58()
    data class Success(val data: String) : State362_58()
    data class Error(val message: String) : State362_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}