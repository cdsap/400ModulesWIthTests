package com.awesomeapp.module_1_112

sealed class State112_38 {
    data object Loading : State112_38()
    data class Success(val data: String) : State112_38()
    data class Error(val message: String) : State112_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}