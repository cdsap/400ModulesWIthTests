package com.awesomeapp.module_4_339

sealed class State339_118 {
    data object Loading : State339_118()
    data class Success(val data: String) : State339_118()
    data class Error(val message: String) : State339_118()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}