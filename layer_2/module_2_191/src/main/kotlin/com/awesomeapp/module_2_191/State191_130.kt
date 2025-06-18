package com.awesomeapp.module_2_191

sealed class State191_130 {
    data object Loading : State191_130()
    data class Success(val data: String) : State191_130()
    data class Error(val message: String) : State191_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}