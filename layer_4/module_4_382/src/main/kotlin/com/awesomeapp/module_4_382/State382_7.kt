package com.awesomeapp.module_4_382

sealed class State382_7 {
    data object Loading : State382_7()
    data class Success(val data: String) : State382_7()
    data class Error(val message: String) : State382_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}