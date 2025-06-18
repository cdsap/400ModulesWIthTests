package com.awesomeapp.module_3_251

sealed class State251_97 {
    data object Loading : State251_97()
    data class Success(val data: String) : State251_97()
    data class Error(val message: String) : State251_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}