package com.awesomeapp.module_0_20

sealed class State20_119 {
    data object Loading : State20_119()
    data class Success(val data: String) : State20_119()
    data class Error(val message: String) : State20_119()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}