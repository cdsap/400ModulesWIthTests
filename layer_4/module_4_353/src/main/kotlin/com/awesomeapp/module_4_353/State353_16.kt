package com.awesomeapp.module_4_353

sealed class State353_16 {
    data object Loading : State353_16()
    data class Success(val data: String) : State353_16()
    data class Error(val message: String) : State353_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}