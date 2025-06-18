package com.awesomeapp.module_3_265

sealed class State265_16 {
    data object Loading : State265_16()
    data class Success(val data: String) : State265_16()
    data class Error(val message: String) : State265_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}