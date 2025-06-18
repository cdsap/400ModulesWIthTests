package com.awesomeapp.module_0_62

sealed class State62_13 {
    data object Loading : State62_13()
    data class Success(val data: String) : State62_13()
    data class Error(val message: String) : State62_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}