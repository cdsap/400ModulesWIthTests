package com.awesomeapp.module_1_112

sealed class State112_131 {
    data object Loading : State112_131()
    data class Success(val data: String) : State112_131()
    data class Error(val message: String) : State112_131()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}