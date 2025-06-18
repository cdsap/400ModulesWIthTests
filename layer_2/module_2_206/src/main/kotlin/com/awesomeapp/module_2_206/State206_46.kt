package com.awesomeapp.module_2_206

sealed class State206_46 {
    data object Loading : State206_46()
    data class Success(val data: String) : State206_46()
    data class Error(val message: String) : State206_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}