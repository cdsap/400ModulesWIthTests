package com.awesomeapp.module_1_101

sealed class State101_112 {
    data object Loading : State101_112()
    data class Success(val data: String) : State101_112()
    data class Error(val message: String) : State101_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}