package com.awesomeapp.module_2_184

sealed class State184_83 {
    data object Loading : State184_83()
    data class Success(val data: String) : State184_83()
    data class Error(val message: String) : State184_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}