package com.awesomeapp.module_0_44

sealed class State44_44 {
    data object Loading : State44_44()
    data class Success(val data: String) : State44_44()
    data class Error(val message: String) : State44_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}