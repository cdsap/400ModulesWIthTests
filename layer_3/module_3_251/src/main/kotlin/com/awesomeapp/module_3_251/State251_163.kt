package com.awesomeapp.module_3_251

sealed class State251_163 {
    data object Loading : State251_163()
    data class Success(val data: String) : State251_163()
    data class Error(val message: String) : State251_163()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}