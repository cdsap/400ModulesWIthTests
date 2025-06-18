package com.awesomeapp.module_4_381

sealed class State381_64 {
    data object Loading : State381_64()
    data class Success(val data: String) : State381_64()
    data class Error(val message: String) : State381_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}