package com.awesomeapp.module_0_13

sealed class State13_58 {
    data object Loading : State13_58()
    data class Success(val data: String) : State13_58()
    data class Error(val message: String) : State13_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}