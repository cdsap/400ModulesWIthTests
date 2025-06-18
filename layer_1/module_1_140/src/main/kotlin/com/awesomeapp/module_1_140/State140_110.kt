package com.awesomeapp.module_1_140

sealed class State140_110 {
    data object Loading : State140_110()
    data class Success(val data: String) : State140_110()
    data class Error(val message: String) : State140_110()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}