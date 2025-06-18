package com.awesomeapp.module_0_63

sealed class State63_112 {
    data object Loading : State63_112()
    data class Success(val data: String) : State63_112()
    data class Error(val message: String) : State63_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}