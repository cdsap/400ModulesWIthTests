package com.awesomeapp.module_3_315

sealed class State315_118 {
    data object Loading : State315_118()
    data class Success(val data: String) : State315_118()
    data class Error(val message: String) : State315_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}