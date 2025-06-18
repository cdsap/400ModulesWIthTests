package com.awesomeapp.module_0_75

sealed class State75_22 {
    data object Loading : State75_22()
    data class Success(val data: String) : State75_22()
    data class Error(val message: String) : State75_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}