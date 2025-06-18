package com.awesomeapp.module_0_72

sealed class State72_137 {
    data object Loading : State72_137()
    data class Success(val data: String) : State72_137()
    data class Error(val message: String) : State72_137()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}