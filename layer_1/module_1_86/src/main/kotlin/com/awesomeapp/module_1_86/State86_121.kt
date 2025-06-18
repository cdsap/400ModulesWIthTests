package com.awesomeapp.module_1_86

sealed class State86_121 {
    data object Loading : State86_121()
    data class Success(val data: String) : State86_121()
    data class Error(val message: String) : State86_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}