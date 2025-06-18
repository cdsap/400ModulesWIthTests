package com.awesomeapp.module_4_382

sealed class State382_43 {
    data object Loading : State382_43()
    data class Success(val data: String) : State382_43()
    data class Error(val message: String) : State382_43()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}