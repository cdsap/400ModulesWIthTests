package com.awesomeapp.module_0_7

sealed class State7_40 {
    data object Loading : State7_40()
    data class Success(val data: String) : State7_40()
    data class Error(val message: String) : State7_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}