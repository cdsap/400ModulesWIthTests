package com.awesomeapp.module_3_251

sealed class State251_58 {
    data object Loading : State251_58()
    data class Success(val data: String) : State251_58()
    data class Error(val message: String) : State251_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}