package com.awesomeapp.module_2_205

sealed class State205_118 {
    data object Loading : State205_118()
    data class Success(val data: String) : State205_118()
    data class Error(val message: String) : State205_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}