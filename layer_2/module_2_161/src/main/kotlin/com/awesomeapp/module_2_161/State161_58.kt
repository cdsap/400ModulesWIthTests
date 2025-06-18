package com.awesomeapp.module_2_161

sealed class State161_58 {
    data object Loading : State161_58()
    data class Success(val data: String) : State161_58()
    data class Error(val message: String) : State161_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}