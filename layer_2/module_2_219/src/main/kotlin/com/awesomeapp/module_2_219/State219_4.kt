package com.awesomeapp.module_2_219

sealed class State219_4 {
    data object Loading : State219_4()
    data class Success(val data: String) : State219_4()
    data class Error(val message: String) : State219_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}