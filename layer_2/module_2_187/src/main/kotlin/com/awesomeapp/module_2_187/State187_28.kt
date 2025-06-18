package com.awesomeapp.module_2_187

sealed class State187_28 {
    data object Loading : State187_28()
    data class Success(val data: String) : State187_28()
    data class Error(val message: String) : State187_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}