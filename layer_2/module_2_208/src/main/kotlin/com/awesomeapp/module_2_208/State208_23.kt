package com.awesomeapp.module_2_208

sealed class State208_23 {
    data object Loading : State208_23()
    data class Success(val data: String) : State208_23()
    data class Error(val message: String) : State208_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}