package com.awesomeapp.module_4_382

sealed class State382_133 {
    data object Loading : State382_133()
    data class Success(val data: String) : State382_133()
    data class Error(val message: String) : State382_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}