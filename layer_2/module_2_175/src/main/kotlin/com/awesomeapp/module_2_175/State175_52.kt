package com.awesomeapp.module_2_175

sealed class State175_52 {
    data object Loading : State175_52()
    data class Success(val data: String) : State175_52()
    data class Error(val message: String) : State175_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}