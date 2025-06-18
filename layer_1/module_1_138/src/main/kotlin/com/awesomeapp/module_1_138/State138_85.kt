package com.awesomeapp.module_1_138

sealed class State138_85 {
    data object Loading : State138_85()
    data class Success(val data: String) : State138_85()
    data class Error(val message: String) : State138_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}