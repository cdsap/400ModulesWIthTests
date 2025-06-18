package com.awesomeapp.module_4_382

sealed class State382_127 {
    data object Loading : State382_127()
    data class Success(val data: String) : State382_127()
    data class Error(val message: String) : State382_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}