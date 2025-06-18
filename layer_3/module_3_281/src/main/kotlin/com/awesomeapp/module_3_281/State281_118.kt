package com.awesomeapp.module_3_281

sealed class State281_118 {
    data object Loading : State281_118()
    data class Success(val data: String) : State281_118()
    data class Error(val message: String) : State281_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}