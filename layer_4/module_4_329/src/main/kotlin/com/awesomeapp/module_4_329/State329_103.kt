package com.awesomeapp.module_4_329

sealed class State329_103 {
    data object Loading : State329_103()
    data class Success(val data: String) : State329_103()
    data class Error(val message: String) : State329_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}