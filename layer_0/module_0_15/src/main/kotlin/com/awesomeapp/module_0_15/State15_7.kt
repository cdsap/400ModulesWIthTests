package com.awesomeapp.module_0_15

sealed class State15_7 {
    data object Loading : State15_7()
    data class Success(val data: String) : State15_7()
    data class Error(val message: String) : State15_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}