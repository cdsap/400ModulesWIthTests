package com.awesomeapp.module_1_159

sealed class State159_106 {
    data object Loading : State159_106()
    data class Success(val data: String) : State159_106()
    data class Error(val message: String) : State159_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}