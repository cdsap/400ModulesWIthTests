package com.awesomeapp.module_0_66

sealed class State66_4 {
    data object Loading : State66_4()
    data class Success(val data: String) : State66_4()
    data class Error(val message: String) : State66_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}