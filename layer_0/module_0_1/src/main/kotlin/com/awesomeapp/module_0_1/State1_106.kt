package com.awesomeapp.module_0_1

sealed class State1_106 {
    data object Loading : State1_106()
    data class Success(val data: String) : State1_106()
    data class Error(val message: String) : State1_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}