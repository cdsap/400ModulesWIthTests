package com.awesomeapp.module_0_66

sealed class State66_46 {
    data object Loading : State66_46()
    data class Success(val data: String) : State66_46()
    data class Error(val message: String) : State66_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}