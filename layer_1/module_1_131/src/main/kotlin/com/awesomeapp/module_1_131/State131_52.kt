package com.awesomeapp.module_1_131

sealed class State131_52 {
    data object Loading : State131_52()
    data class Success(val data: String) : State131_52()
    data class Error(val message: String) : State131_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}