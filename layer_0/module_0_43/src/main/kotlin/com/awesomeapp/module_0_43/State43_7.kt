package com.awesomeapp.module_0_43

sealed class State43_7 {
    data object Loading : State43_7()
    data class Success(val data: String) : State43_7()
    data class Error(val message: String) : State43_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}