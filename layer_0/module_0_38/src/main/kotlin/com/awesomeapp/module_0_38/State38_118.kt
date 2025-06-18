package com.awesomeapp.module_0_38

sealed class State38_118 {
    data object Loading : State38_118()
    data class Success(val data: String) : State38_118()
    data class Error(val message: String) : State38_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}