package com.awesomeapp.module_0_44

sealed class State44_83 {
    data object Loading : State44_83()
    data class Success(val data: String) : State44_83()
    data class Error(val message: String) : State44_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}