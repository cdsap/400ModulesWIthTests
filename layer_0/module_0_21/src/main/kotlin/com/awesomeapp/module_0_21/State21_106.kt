package com.awesomeapp.module_0_21

sealed class State21_106 {
    data object Loading : State21_106()
    data class Success(val data: String) : State21_106()
    data class Error(val message: String) : State21_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}