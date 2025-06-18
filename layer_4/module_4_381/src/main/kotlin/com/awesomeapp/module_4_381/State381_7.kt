package com.awesomeapp.module_4_381

sealed class State381_7 {
    data object Loading : State381_7()
    data class Success(val data: String) : State381_7()
    data class Error(val message: String) : State381_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}