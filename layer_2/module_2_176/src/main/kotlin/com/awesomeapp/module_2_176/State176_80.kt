package com.awesomeapp.module_2_176

sealed class State176_80 {
    data object Loading : State176_80()
    data class Success(val data: String) : State176_80()
    data class Error(val message: String) : State176_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}