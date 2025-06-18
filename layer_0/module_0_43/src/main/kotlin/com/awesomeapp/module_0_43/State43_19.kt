package com.awesomeapp.module_0_43

sealed class State43_19 {
    data object Loading : State43_19()
    data class Success(val data: String) : State43_19()
    data class Error(val message: String) : State43_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}