package com.awesomeapp.module_4_328

sealed class State328_44 {
    data object Loading : State328_44()
    data class Success(val data: String) : State328_44()
    data class Error(val message: String) : State328_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}