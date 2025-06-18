package com.awesomeapp.module_3_251

sealed class State251_136 {
    data object Loading : State251_136()
    data class Success(val data: String) : State251_136()
    data class Error(val message: String) : State251_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}