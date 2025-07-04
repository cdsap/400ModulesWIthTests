package com.awesomeapp.module_0_69

sealed class State69_28 {
    data object Loading : State69_28()
    data class Success(val data: String) : State69_28()
    data class Error(val message: String) : State69_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}