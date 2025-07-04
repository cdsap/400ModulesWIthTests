package com.awesomeapp.module_3_264

sealed class State264_89 {
    data object Loading : State264_89()
    data class Success(val data: String) : State264_89()
    data class Error(val message: String) : State264_89()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}