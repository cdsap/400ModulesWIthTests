package com.awesomeapp.module_0_60

sealed class State60_92 {
    data object Loading : State60_92()
    data class Success(val data: String) : State60_92()
    data class Error(val message: String) : State60_92()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}