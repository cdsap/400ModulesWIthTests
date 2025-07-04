package com.awesomeapp.module_1_92

sealed class State92_23 {
    data object Loading : State92_23()
    data class Success(val data: String) : State92_23()
    data class Error(val message: String) : State92_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}