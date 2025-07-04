package com.awesomeapp.module_0_44

sealed class State44_20 {
    data object Loading : State44_20()
    data class Success(val data: String) : State44_20()
    data class Error(val message: String) : State44_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}