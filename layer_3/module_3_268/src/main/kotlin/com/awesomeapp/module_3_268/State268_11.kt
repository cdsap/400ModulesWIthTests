package com.awesomeapp.module_3_268

sealed class State268_11 {
    data object Loading : State268_11()
    data class Success(val data: String) : State268_11()
    data class Error(val message: String) : State268_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}