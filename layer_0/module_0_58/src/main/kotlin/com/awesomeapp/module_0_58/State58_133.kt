package com.awesomeapp.module_0_58

sealed class State58_133 {
    data object Loading : State58_133()
    data class Success(val data: String) : State58_133()
    data class Error(val message: String) : State58_133()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}