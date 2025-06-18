package com.awesomeapp.module_0_24

sealed class State24_59 {
    data object Loading : State24_59()
    data class Success(val data: String) : State24_59()
    data class Error(val message: String) : State24_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}