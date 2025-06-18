package com.awesomeapp.module_0_72

sealed class State72_122 {
    data object Loading : State72_122()
    data class Success(val data: String) : State72_122()
    data class Error(val message: String) : State72_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}