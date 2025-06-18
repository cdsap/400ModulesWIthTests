package com.awesomeapp.module_1_158

sealed class State158_52 {
    data object Loading : State158_52()
    data class Success(val data: String) : State158_52()
    data class Error(val message: String) : State158_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}