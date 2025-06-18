package com.awesomeapp.module_4_341

sealed class State341_16 {
    data object Loading : State341_16()
    data class Success(val data: String) : State341_16()
    data class Error(val message: String) : State341_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}