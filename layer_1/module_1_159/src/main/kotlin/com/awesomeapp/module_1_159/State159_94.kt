package com.awesomeapp.module_1_159

sealed class State159_94 {
    data object Loading : State159_94()
    data class Success(val data: String) : State159_94()
    data class Error(val message: String) : State159_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}