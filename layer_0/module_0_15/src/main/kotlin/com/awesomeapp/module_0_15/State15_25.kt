package com.awesomeapp.module_0_15

sealed class State15_25 {
    data object Loading : State15_25()
    data class Success(val data: String) : State15_25()
    data class Error(val message: String) : State15_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}