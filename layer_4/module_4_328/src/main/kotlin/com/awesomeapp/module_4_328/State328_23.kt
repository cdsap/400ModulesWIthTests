package com.awesomeapp.module_4_328

sealed class State328_23 {
    data object Loading : State328_23()
    data class Success(val data: String) : State328_23()
    data class Error(val message: String) : State328_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}