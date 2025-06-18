package com.awesomeapp.module_4_365

sealed class State365_94 {
    data object Loading : State365_94()
    data class Success(val data: String) : State365_94()
    data class Error(val message: String) : State365_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}