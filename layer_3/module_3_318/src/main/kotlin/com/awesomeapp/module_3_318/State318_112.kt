package com.awesomeapp.module_3_318

sealed class State318_112 {
    data object Loading : State318_112()
    data class Success(val data: String) : State318_112()
    data class Error(val message: String) : State318_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}