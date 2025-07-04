package com.awesomeapp.module_4_321

sealed class State321_16 {
    data object Loading : State321_16()
    data class Success(val data: String) : State321_16()
    data class Error(val message: String) : State321_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}