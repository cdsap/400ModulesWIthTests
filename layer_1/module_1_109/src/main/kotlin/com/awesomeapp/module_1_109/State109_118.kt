package com.awesomeapp.module_1_109

sealed class State109_118 {
    data object Loading : State109_118()
    data class Success(val data: String) : State109_118()
    data class Error(val message: String) : State109_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}