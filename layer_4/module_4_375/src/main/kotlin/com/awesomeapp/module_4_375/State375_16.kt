package com.awesomeapp.module_4_375

sealed class State375_16 {
    data object Loading : State375_16()
    data class Success(val data: String) : State375_16()
    data class Error(val message: String) : State375_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}