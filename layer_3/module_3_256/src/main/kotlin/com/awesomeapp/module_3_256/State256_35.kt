package com.awesomeapp.module_3_256

sealed class State256_35 {
    data object Loading : State256_35()
    data class Success(val data: String) : State256_35()
    data class Error(val message: String) : State256_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}