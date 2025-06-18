package com.awesomeapp.module_0_29

sealed class State29_121 {
    data object Loading : State29_121()
    data class Success(val data: String) : State29_121()
    data class Error(val message: String) : State29_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}