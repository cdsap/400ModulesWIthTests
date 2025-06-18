package com.awesomeapp.module_0_37

sealed class State37_16 {
    data object Loading : State37_16()
    data class Success(val data: String) : State37_16()
    data class Error(val message: String) : State37_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}