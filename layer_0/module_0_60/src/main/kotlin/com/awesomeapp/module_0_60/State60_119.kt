package com.awesomeapp.module_0_60

sealed class State60_119 {
    data object Loading : State60_119()
    data class Success(val data: String) : State60_119()
    data class Error(val message: String) : State60_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}