package com.awesomeapp.module_0_28

sealed class State28_95 {
    data object Loading : State28_95()
    data class Success(val data: String) : State28_95()
    data class Error(val message: String) : State28_95()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}