package com.awesomeapp.module_1_100

sealed class State100_41 {
    data object Loading : State100_41()
    data class Success(val data: String) : State100_41()
    data class Error(val message: String) : State100_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}