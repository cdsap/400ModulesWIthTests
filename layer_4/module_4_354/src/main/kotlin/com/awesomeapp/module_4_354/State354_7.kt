package com.awesomeapp.module_4_354

sealed class State354_7 {
    data object Loading : State354_7()
    data class Success(val data: String) : State354_7()
    data class Error(val message: String) : State354_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}