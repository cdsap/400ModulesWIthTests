package com.awesomeapp.module_0_64

sealed class State64_74 {
    data object Loading : State64_74()
    data class Success(val data: String) : State64_74()
    data class Error(val message: String) : State64_74()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}