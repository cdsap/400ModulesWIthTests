package com.awesomeapp.module_2_206

sealed class State206_106 {
    data object Loading : State206_106()
    data class Success(val data: String) : State206_106()
    data class Error(val message: String) : State206_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}