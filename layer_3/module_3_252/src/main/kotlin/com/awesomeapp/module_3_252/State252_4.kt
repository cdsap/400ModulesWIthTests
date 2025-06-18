package com.awesomeapp.module_3_252

sealed class State252_4 {
    data object Loading : State252_4()
    data class Success(val data: String) : State252_4()
    data class Error(val message: String) : State252_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}