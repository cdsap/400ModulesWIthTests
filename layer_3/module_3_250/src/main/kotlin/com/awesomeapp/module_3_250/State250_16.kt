package com.awesomeapp.module_3_250

sealed class State250_16 {
    data object Loading : State250_16()
    data class Success(val data: String) : State250_16()
    data class Error(val message: String) : State250_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}