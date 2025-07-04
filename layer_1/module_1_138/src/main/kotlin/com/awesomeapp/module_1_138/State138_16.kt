package com.awesomeapp.module_1_138

sealed class State138_16 {
    data object Loading : State138_16()
    data class Success(val data: String) : State138_16()
    data class Error(val message: String) : State138_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}