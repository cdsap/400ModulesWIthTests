package com.awesomeapp.module_0_19

sealed class State19_172 {
    data object Loading : State19_172()
    data class Success(val data: String) : State19_172()
    data class Error(val message: String) : State19_172()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}