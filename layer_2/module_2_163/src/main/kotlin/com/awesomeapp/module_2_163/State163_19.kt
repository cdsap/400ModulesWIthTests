package com.awesomeapp.module_2_163

sealed class State163_19 {
    data object Loading : State163_19()
    data class Success(val data: String) : State163_19()
    data class Error(val message: String) : State163_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}