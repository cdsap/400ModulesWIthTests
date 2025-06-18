package com.awesomeapp.module_0_32

sealed class State32_134 {
    data object Loading : State32_134()
    data class Success(val data: String) : State32_134()
    data class Error(val message: String) : State32_134()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}