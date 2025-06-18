package com.awesomeapp.module_4_393

sealed class State393_112 {
    data object Loading : State393_112()
    data class Success(val data: String) : State393_112()
    data class Error(val message: String) : State393_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}