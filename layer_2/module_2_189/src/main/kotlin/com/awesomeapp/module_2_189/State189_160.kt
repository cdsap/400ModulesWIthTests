package com.awesomeapp.module_2_189

sealed class State189_160 {
    data object Loading : State189_160()
    data class Success(val data: String) : State189_160()
    data class Error(val message: String) : State189_160()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}