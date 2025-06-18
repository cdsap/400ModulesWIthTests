package com.awesomeapp.module_3_265

sealed class State265_22 {
    data object Loading : State265_22()
    data class Success(val data: String) : State265_22()
    data class Error(val message: String) : State265_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}