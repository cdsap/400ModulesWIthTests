package com.awesomeapp.module_4_382

sealed class State382_145 {
    data object Loading : State382_145()
    data class Success(val data: String) : State382_145()
    data class Error(val message: String) : State382_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}