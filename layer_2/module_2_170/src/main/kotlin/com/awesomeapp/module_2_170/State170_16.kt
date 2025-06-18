package com.awesomeapp.module_2_170

sealed class State170_16 {
    data object Loading : State170_16()
    data class Success(val data: String) : State170_16()
    data class Error(val message: String) : State170_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}