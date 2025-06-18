package com.awesomeapp.module_4_365

sealed class State365_31 {
    data object Loading : State365_31()
    data class Success(val data: String) : State365_31()
    data class Error(val message: String) : State365_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}