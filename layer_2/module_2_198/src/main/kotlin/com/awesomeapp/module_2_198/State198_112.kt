package com.awesomeapp.module_2_198

sealed class State198_112 {
    data object Loading : State198_112()
    data class Success(val data: String) : State198_112()
    data class Error(val message: String) : State198_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}