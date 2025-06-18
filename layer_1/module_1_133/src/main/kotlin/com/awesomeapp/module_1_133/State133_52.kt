package com.awesomeapp.module_1_133

sealed class State133_52 {
    data object Loading : State133_52()
    data class Success(val data: String) : State133_52()
    data class Error(val message: String) : State133_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}