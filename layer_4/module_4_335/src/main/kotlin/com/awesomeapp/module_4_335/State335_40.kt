package com.awesomeapp.module_4_335

sealed class State335_40 {
    data object Loading : State335_40()
    data class Success(val data: String) : State335_40()
    data class Error(val message: String) : State335_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}