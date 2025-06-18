package com.awesomeapp.module_0_44

sealed class State44_95 {
    data object Loading : State44_95()
    data class Success(val data: String) : State44_95()
    data class Error(val message: String) : State44_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}