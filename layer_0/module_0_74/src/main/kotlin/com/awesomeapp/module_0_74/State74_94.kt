package com.awesomeapp.module_0_74

sealed class State74_94 {
    data object Loading : State74_94()
    data class Success(val data: String) : State74_94()
    data class Error(val message: String) : State74_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}