package com.awesomeapp.module_1_137

sealed class State137_130 {
    data object Loading : State137_130()
    data class Success(val data: String) : State137_130()
    data class Error(val message: String) : State137_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}