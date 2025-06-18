package com.awesomeapp.module_2_240

sealed class State240_4 {
    data object Loading : State240_4()
    data class Success(val data: String) : State240_4()
    data class Error(val message: String) : State240_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}