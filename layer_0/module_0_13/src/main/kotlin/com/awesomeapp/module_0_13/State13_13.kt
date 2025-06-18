package com.awesomeapp.module_0_13

sealed class State13_13 {
    data object Loading : State13_13()
    data class Success(val data: String) : State13_13()
    data class Error(val message: String) : State13_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}