package com.awesomeapp.module_0_74

sealed class State74_79 {
    data object Loading : State74_79()
    data class Success(val data: String) : State74_79()
    data class Error(val message: String) : State74_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}