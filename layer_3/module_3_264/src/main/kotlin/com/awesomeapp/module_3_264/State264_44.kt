package com.awesomeapp.module_3_264

sealed class State264_44 {
    data object Loading : State264_44()
    data class Success(val data: String) : State264_44()
    data class Error(val message: String) : State264_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}