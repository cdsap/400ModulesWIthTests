package com.awesomeapp.module_2_197

sealed class State197_16 {
    data object Loading : State197_16()
    data class Success(val data: String) : State197_16()
    data class Error(val message: String) : State197_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}