package com.awesomeapp.module_2_212

sealed class State212_149 {
    data object Loading : State212_149()
    data class Success(val data: String) : State212_149()
    data class Error(val message: String) : State212_149()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}