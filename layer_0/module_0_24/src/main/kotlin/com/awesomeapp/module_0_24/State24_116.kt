package com.awesomeapp.module_0_24

sealed class State24_116 {
    data object Loading : State24_116()
    data class Success(val data: String) : State24_116()
    data class Error(val message: String) : State24_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}