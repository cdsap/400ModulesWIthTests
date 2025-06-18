package com.awesomeapp.module_0_77

sealed class State77_13 {
    data object Loading : State77_13()
    data class Success(val data: String) : State77_13()
    data class Error(val message: String) : State77_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}