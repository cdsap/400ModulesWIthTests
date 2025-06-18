package com.awesomeapp.module_4_381

sealed class State381_169 {
    data object Loading : State381_169()
    data class Success(val data: String) : State381_169()
    data class Error(val message: String) : State381_169()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}