package com.awesomeapp.module_2_232

sealed class State232_158 {
    data object Loading : State232_158()
    data class Success(val data: String) : State232_158()
    data class Error(val message: String) : State232_158()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}