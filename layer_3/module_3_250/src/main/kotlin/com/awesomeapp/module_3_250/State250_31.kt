package com.awesomeapp.module_3_250

sealed class State250_31 {
    data object Loading : State250_31()
    data class Success(val data: String) : State250_31()
    data class Error(val message: String) : State250_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}