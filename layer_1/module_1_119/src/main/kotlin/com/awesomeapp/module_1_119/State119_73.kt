package com.awesomeapp.module_1_119

sealed class State119_73 {
    data object Loading : State119_73()
    data class Success(val data: String) : State119_73()
    data class Error(val message: String) : State119_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}