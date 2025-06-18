package com.awesomeapp.module_0_21

sealed class State21_172 {
    data object Loading : State21_172()
    data class Success(val data: String) : State21_172()
    data class Error(val message: String) : State21_172()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}