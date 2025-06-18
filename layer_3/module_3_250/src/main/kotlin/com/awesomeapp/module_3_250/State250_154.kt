package com.awesomeapp.module_3_250

sealed class State250_154 {
    data object Loading : State250_154()
    data class Success(val data: String) : State250_154()
    data class Error(val message: String) : State250_154()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}