package com.awesomeapp.module_4_365

sealed class State365_46 {
    data object Loading : State365_46()
    data class Success(val data: String) : State365_46()
    data class Error(val message: String) : State365_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}