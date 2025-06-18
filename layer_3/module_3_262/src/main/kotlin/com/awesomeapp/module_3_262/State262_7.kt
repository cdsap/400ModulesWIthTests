package com.awesomeapp.module_3_262

sealed class State262_7 {
    data object Loading : State262_7()
    data class Success(val data: String) : State262_7()
    data class Error(val message: String) : State262_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}