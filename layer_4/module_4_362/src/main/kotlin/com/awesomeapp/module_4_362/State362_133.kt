package com.awesomeapp.module_4_362

sealed class State362_133 {
    data object Loading : State362_133()
    data class Success(val data: String) : State362_133()
    data class Error(val message: String) : State362_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}