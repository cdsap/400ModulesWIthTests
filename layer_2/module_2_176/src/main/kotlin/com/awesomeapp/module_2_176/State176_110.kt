package com.awesomeapp.module_2_176

sealed class State176_110 {
    data object Loading : State176_110()
    data class Success(val data: String) : State176_110()
    data class Error(val message: String) : State176_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}