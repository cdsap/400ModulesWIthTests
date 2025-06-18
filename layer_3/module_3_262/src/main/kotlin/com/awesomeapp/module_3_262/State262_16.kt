package com.awesomeapp.module_3_262

sealed class State262_16 {
    data object Loading : State262_16()
    data class Success(val data: String) : State262_16()
    data class Error(val message: String) : State262_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}