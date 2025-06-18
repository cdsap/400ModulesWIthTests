package com.awesomeapp.module_1_158

sealed class State158_70 {
    data object Loading : State158_70()
    data class Success(val data: String) : State158_70()
    data class Error(val message: String) : State158_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}