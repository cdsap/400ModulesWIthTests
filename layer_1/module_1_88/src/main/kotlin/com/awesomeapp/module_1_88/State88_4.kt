package com.awesomeapp.module_1_88

sealed class State88_4 {
    data object Loading : State88_4()
    data class Success(val data: String) : State88_4()
    data class Error(val message: String) : State88_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}