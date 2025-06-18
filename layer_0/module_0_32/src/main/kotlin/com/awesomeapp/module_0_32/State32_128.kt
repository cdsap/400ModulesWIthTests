package com.awesomeapp.module_0_32

sealed class State32_128 {
    data object Loading : State32_128()
    data class Success(val data: String) : State32_128()
    data class Error(val message: String) : State32_128()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}