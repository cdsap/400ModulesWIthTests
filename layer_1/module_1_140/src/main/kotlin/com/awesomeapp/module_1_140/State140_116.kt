package com.awesomeapp.module_1_140

sealed class State140_116 {
    data object Loading : State140_116()
    data class Success(val data: String) : State140_116()
    data class Error(val message: String) : State140_116()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}