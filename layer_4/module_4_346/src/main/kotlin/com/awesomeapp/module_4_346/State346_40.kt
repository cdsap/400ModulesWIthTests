package com.awesomeapp.module_4_346

sealed class State346_40 {
    data object Loading : State346_40()
    data class Success(val data: String) : State346_40()
    data class Error(val message: String) : State346_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}