package com.awesomeapp.module_0_75

sealed class State75_40 {
    data object Loading : State75_40()
    data class Success(val data: String) : State75_40()
    data class Error(val message: String) : State75_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}