package com.awesomeapp.module_1_84

sealed class State84_8 {
    data object Loading : State84_8()
    data class Success(val data: String) : State84_8()
    data class Error(val message: String) : State84_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}