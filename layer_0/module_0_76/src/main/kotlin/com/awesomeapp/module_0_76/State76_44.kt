package com.awesomeapp.module_0_76

sealed class State76_44 {
    data object Loading : State76_44()
    data class Success(val data: String) : State76_44()
    data class Error(val message: String) : State76_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}