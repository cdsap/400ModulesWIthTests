package com.awesomeapp.module_0_23

sealed class State23_40 {
    data object Loading : State23_40()
    data class Success(val data: String) : State23_40()
    data class Error(val message: String) : State23_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}