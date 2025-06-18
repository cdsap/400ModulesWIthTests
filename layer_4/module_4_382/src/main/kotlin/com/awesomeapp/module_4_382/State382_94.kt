package com.awesomeapp.module_4_382

sealed class State382_94 {
    data object Loading : State382_94()
    data class Success(val data: String) : State382_94()
    data class Error(val message: String) : State382_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}