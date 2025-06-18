package com.awesomeapp.module_4_382

sealed class State382_4 {
    data object Loading : State382_4()
    data class Success(val data: String) : State382_4()
    data class Error(val message: String) : State382_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}