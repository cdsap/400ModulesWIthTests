package com.awesomeapp.module_1_87

sealed class State87_22 {
    data object Loading : State87_22()
    data class Success(val data: String) : State87_22()
    data class Error(val message: String) : State87_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}