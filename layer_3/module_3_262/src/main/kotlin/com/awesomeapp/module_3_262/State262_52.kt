package com.awesomeapp.module_3_262

sealed class State262_52 {
    data object Loading : State262_52()
    data class Success(val data: String) : State262_52()
    data class Error(val message: String) : State262_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}