package com.awesomeapp.module_1_83

sealed class State83_16 {
    data object Loading : State83_16()
    data class Success(val data: String) : State83_16()
    data class Error(val message: String) : State83_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}