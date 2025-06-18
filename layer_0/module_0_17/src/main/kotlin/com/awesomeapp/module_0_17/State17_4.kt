package com.awesomeapp.module_0_17

sealed class State17_4 {
    data object Loading : State17_4()
    data class Success(val data: String) : State17_4()
    data class Error(val message: String) : State17_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}