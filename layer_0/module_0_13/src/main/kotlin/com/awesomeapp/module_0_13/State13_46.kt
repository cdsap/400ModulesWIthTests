package com.awesomeapp.module_0_13

sealed class State13_46 {
    data object Loading : State13_46()
    data class Success(val data: String) : State13_46()
    data class Error(val message: String) : State13_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}