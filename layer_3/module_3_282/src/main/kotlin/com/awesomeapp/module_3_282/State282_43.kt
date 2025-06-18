package com.awesomeapp.module_3_282

sealed class State282_43 {
    data object Loading : State282_43()
    data class Success(val data: String) : State282_43()
    data class Error(val message: String) : State282_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}