package com.awesomeapp.module_0_56

sealed class State56_23 {
    data object Loading : State56_23()
    data class Success(val data: String) : State56_23()
    data class Error(val message: String) : State56_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}