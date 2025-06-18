package com.awesomeapp.module_1_81

sealed class State81_46 {
    data object Loading : State81_46()
    data class Success(val data: String) : State81_46()
    data class Error(val message: String) : State81_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}