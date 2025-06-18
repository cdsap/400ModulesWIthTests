package com.awesomeapp.module_2_175

sealed class State175_76 {
    data object Loading : State175_76()
    data class Success(val data: String) : State175_76()
    data class Error(val message: String) : State175_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}