package com.awesomeapp.module_1_140

sealed class State140_44 {
    data object Loading : State140_44()
    data class Success(val data: String) : State140_44()
    data class Error(val message: String) : State140_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}