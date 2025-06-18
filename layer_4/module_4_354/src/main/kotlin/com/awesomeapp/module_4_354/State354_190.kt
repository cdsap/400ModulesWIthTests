package com.awesomeapp.module_4_354

sealed class State354_190 {
    data object Loading : State354_190()
    data class Success(val data: String) : State354_190()
    data class Error(val message: String) : State354_190()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}