package com.awesomeapp.module_2_176

sealed class State176_119 {
    data object Loading : State176_119()
    data class Success(val data: String) : State176_119()
    data class Error(val message: String) : State176_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}