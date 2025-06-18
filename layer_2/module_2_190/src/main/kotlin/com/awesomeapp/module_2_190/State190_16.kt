package com.awesomeapp.module_2_190

sealed class State190_16 {
    data object Loading : State190_16()
    data class Success(val data: String) : State190_16()
    data class Error(val message: String) : State190_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}