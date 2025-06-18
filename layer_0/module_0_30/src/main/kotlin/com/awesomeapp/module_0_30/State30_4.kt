package com.awesomeapp.module_0_30

sealed class State30_4 {
    data object Loading : State30_4()
    data class Success(val data: String) : State30_4()
    data class Error(val message: String) : State30_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}