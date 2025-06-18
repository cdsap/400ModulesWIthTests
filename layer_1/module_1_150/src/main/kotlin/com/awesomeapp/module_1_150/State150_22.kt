package com.awesomeapp.module_1_150

sealed class State150_22 {
    data object Loading : State150_22()
    data class Success(val data: String) : State150_22()
    data class Error(val message: String) : State150_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}