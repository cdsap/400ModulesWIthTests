package com.awesomeapp.module_1_141

sealed class State141_157 {
    data object Loading : State141_157()
    data class Success(val data: String) : State141_157()
    data class Error(val message: String) : State141_157()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}