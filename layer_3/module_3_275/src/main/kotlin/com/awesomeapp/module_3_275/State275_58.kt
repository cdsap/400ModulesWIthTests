package com.awesomeapp.module_3_275

sealed class State275_58 {
    data object Loading : State275_58()
    data class Success(val data: String) : State275_58()
    data class Error(val message: String) : State275_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}