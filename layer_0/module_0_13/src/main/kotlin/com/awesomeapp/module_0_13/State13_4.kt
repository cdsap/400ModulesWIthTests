package com.awesomeapp.module_0_13

sealed class State13_4 {
    data object Loading : State13_4()
    data class Success(val data: String) : State13_4()
    data class Error(val message: String) : State13_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}