package com.awesomeapp.module_0_22

sealed class State22_16 {
    data object Loading : State22_16()
    data class Success(val data: String) : State22_16()
    data class Error(val message: String) : State22_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}