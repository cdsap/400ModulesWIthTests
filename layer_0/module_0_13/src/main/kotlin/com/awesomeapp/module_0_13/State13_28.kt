package com.awesomeapp.module_0_13

sealed class State13_28 {
    data object Loading : State13_28()
    data class Success(val data: String) : State13_28()
    data class Error(val message: String) : State13_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}