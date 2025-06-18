package com.awesomeapp.module_0_29

sealed class State29_112 {
    data object Loading : State29_112()
    data class Success(val data: String) : State29_112()
    data class Error(val message: String) : State29_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}