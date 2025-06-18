package com.awesomeapp.module_2_187

sealed class State187_16 {
    data object Loading : State187_16()
    data class Success(val data: String) : State187_16()
    data class Error(val message: String) : State187_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}