package com.awesomeapp.module_1_123

sealed class State123_58 {
    data object Loading : State123_58()
    data class Success(val data: String) : State123_58()
    data class Error(val message: String) : State123_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}