package com.awesomeapp.module_4_368

sealed class State368_32 {
    data object Loading : State368_32()
    data class Success(val data: String) : State368_32()
    data class Error(val message: String) : State368_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}