package com.awesomeapp.module_4_346

sealed class State346_46 {
    data object Loading : State346_46()
    data class Success(val data: String) : State346_46()
    data class Error(val message: String) : State346_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}