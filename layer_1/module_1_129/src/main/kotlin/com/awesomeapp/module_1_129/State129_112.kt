package com.awesomeapp.module_1_129

sealed class State129_112 {
    data object Loading : State129_112()
    data class Success(val data: String) : State129_112()
    data class Error(val message: String) : State129_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}