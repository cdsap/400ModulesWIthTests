package com.awesomeapp.module_4_333

sealed class State333_7 {
    data object Loading : State333_7()
    data class Success(val data: String) : State333_7()
    data class Error(val message: String) : State333_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}