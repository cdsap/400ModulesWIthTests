package com.awesomeapp.module_4_394

sealed class State394_58 {
    data object Loading : State394_58()
    data class Success(val data: String) : State394_58()
    data class Error(val message: String) : State394_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}