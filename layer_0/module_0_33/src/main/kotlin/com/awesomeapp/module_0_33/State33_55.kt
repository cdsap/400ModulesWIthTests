package com.awesomeapp.module_0_33

sealed class State33_55 {
    data object Loading : State33_55()
    data class Success(val data: String) : State33_55()
    data class Error(val message: String) : State33_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}