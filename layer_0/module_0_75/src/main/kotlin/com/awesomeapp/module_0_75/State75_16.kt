package com.awesomeapp.module_0_75

sealed class State75_16 {
    data object Loading : State75_16()
    data class Success(val data: String) : State75_16()
    data class Error(val message: String) : State75_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}