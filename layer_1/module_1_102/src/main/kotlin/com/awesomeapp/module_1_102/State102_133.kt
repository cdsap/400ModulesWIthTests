package com.awesomeapp.module_1_102

sealed class State102_133 {
    data object Loading : State102_133()
    data class Success(val data: String) : State102_133()
    data class Error(val message: String) : State102_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}