package com.awesomeapp.module_4_391

sealed class State391_19 {
    data object Loading : State391_19()
    data class Success(val data: String) : State391_19()
    data class Error(val message: String) : State391_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}