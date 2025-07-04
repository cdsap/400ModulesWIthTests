package com.awesomeapp.module_0_33

sealed class State33_34 {
    data object Loading : State33_34()
    data class Success(val data: String) : State33_34()
    data class Error(val message: String) : State33_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}