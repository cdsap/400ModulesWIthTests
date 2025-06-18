package com.awesomeapp.module_3_255

sealed class State255_58 {
    data object Loading : State255_58()
    data class Success(val data: String) : State255_58()
    data class Error(val message: String) : State255_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}