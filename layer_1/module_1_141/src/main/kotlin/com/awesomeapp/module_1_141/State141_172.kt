package com.awesomeapp.module_1_141

sealed class State141_172 {
    data object Loading : State141_172()
    data class Success(val data: String) : State141_172()
    data class Error(val message: String) : State141_172()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}