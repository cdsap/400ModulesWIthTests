package com.awesomeapp.module_0_38

sealed class State38_136 {
    data object Loading : State38_136()
    data class Success(val data: String) : State38_136()
    data class Error(val message: String) : State38_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}