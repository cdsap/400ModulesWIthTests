package com.awesomeapp.module_0_60

sealed class State60_104 {
    data object Loading : State60_104()
    data class Success(val data: String) : State60_104()
    data class Error(val message: String) : State60_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}