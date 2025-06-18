package com.awesomeapp.module_4_391

sealed class State391_16 {
    data object Loading : State391_16()
    data class Success(val data: String) : State391_16()
    data class Error(val message: String) : State391_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}