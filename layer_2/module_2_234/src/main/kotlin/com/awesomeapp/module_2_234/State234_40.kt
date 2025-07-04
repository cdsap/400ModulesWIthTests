package com.awesomeapp.module_2_234

sealed class State234_40 {
    data object Loading : State234_40()
    data class Success(val data: String) : State234_40()
    data class Error(val message: String) : State234_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}