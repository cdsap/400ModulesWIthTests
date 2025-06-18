package com.awesomeapp.module_4_365

sealed class State365_28 {
    data object Loading : State365_28()
    data class Success(val data: String) : State365_28()
    data class Error(val message: String) : State365_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}