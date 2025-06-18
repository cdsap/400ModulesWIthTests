package com.awesomeapp.module_0_26

sealed class State26_4 {
    data object Loading : State26_4()
    data class Success(val data: String) : State26_4()
    data class Error(val message: String) : State26_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}