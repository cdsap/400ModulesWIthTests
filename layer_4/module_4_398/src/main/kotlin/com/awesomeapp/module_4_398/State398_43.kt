package com.awesomeapp.module_4_398

sealed class State398_43 {
    data object Loading : State398_43()
    data class Success(val data: String) : State398_43()
    data class Error(val message: String) : State398_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}