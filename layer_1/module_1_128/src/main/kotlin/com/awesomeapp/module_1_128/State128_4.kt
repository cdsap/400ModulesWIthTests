package com.awesomeapp.module_1_128

sealed class State128_4 {
    data object Loading : State128_4()
    data class Success(val data: String) : State128_4()
    data class Error(val message: String) : State128_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}