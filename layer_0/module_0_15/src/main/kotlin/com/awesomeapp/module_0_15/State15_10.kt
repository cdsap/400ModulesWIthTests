package com.awesomeapp.module_0_15

sealed class State15_10 {
    data object Loading : State15_10()
    data class Success(val data: String) : State15_10()
    data class Error(val message: String) : State15_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}