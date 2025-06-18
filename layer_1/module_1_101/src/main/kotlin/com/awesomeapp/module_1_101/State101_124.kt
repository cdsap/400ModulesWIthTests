package com.awesomeapp.module_1_101

sealed class State101_124 {
    data object Loading : State101_124()
    data class Success(val data: String) : State101_124()
    data class Error(val message: String) : State101_124()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}