package com.awesomeapp.module_0_24

sealed class State24_137 {
    data object Loading : State24_137()
    data class Success(val data: String) : State24_137()
    data class Error(val message: String) : State24_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}