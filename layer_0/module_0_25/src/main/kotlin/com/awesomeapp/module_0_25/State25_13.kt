package com.awesomeapp.module_0_25

sealed class State25_13 {
    data object Loading : State25_13()
    data class Success(val data: String) : State25_13()
    data class Error(val message: String) : State25_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}