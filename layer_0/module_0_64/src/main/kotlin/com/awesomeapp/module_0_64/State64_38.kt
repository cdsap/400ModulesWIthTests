package com.awesomeapp.module_0_64

sealed class State64_38 {
    data object Loading : State64_38()
    data class Success(val data: String) : State64_38()
    data class Error(val message: String) : State64_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}