package com.awesomeapp.module_4_372

sealed class State372_14 {
    data object Loading : State372_14()
    data class Success(val data: String) : State372_14()
    data class Error(val message: String) : State372_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}