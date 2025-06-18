package com.awesomeapp.module_1_88

sealed class State88_8 {
    data object Loading : State88_8()
    data class Success(val data: String) : State88_8()
    data class Error(val message: String) : State88_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}