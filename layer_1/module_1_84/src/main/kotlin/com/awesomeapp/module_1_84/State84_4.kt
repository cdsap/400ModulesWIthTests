package com.awesomeapp.module_1_84

sealed class State84_4 {
    data object Loading : State84_4()
    data class Success(val data: String) : State84_4()
    data class Error(val message: String) : State84_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}