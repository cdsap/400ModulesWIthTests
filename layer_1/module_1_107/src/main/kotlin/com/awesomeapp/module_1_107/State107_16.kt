package com.awesomeapp.module_1_107

sealed class State107_16 {
    data object Loading : State107_16()
    data class Success(val data: String) : State107_16()
    data class Error(val message: String) : State107_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}