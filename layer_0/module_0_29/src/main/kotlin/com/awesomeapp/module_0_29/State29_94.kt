package com.awesomeapp.module_0_29

sealed class State29_94 {
    data object Loading : State29_94()
    data class Success(val data: String) : State29_94()
    data class Error(val message: String) : State29_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}