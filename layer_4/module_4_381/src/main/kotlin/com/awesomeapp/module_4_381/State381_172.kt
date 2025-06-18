package com.awesomeapp.module_4_381

sealed class State381_172 {
    data object Loading : State381_172()
    data class Success(val data: String) : State381_172()
    data class Error(val message: String) : State381_172()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}