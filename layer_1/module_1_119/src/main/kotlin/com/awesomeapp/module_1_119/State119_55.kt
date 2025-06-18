package com.awesomeapp.module_1_119

sealed class State119_55 {
    data object Loading : State119_55()
    data class Success(val data: String) : State119_55()
    data class Error(val message: String) : State119_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}