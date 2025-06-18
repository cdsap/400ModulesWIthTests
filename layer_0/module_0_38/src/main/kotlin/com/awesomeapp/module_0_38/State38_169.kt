package com.awesomeapp.module_0_38

sealed class State38_169 {
    data object Loading : State38_169()
    data class Success(val data: String) : State38_169()
    data class Error(val message: String) : State38_169()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}