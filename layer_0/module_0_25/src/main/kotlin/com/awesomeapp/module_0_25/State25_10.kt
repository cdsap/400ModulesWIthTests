package com.awesomeapp.module_0_25

sealed class State25_10 {
    data object Loading : State25_10()
    data class Success(val data: String) : State25_10()
    data class Error(val message: String) : State25_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}