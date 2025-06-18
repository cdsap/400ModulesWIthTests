package com.awesomeapp.module_0_71

sealed class State71_55 {
    data object Loading : State71_55()
    data class Success(val data: String) : State71_55()
    data class Error(val message: String) : State71_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}