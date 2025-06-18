package com.awesomeapp.module_4_329

sealed class State329_94 {
    data object Loading : State329_94()
    data class Success(val data: String) : State329_94()
    data class Error(val message: String) : State329_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}