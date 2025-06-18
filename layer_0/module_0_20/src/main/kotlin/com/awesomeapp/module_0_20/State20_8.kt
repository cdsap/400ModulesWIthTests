package com.awesomeapp.module_0_20

sealed class State20_8 {
    data object Loading : State20_8()
    data class Success(val data: String) : State20_8()
    data class Error(val message: String) : State20_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}