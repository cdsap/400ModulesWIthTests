package com.awesomeapp.module_0_72

sealed class State72_38 {
    data object Loading : State72_38()
    data class Success(val data: String) : State72_38()
    data class Error(val message: String) : State72_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}