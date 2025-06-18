package com.awesomeapp.module_0_20

sealed class State20_113 {
    data object Loading : State20_113()
    data class Success(val data: String) : State20_113()
    data class Error(val message: String) : State20_113()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}