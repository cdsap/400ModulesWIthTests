package com.awesomeapp.module_4_333

sealed class State333_16 {
    data object Loading : State333_16()
    data class Success(val data: String) : State333_16()
    data class Error(val message: String) : State333_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}