package com.awesomeapp.module_1_100

sealed class State100_128 {
    data object Loading : State100_128()
    data class Success(val data: String) : State100_128()
    data class Error(val message: String) : State100_128()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}