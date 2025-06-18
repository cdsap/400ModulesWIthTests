package com.awesomeapp.module_4_324

sealed class State324_44 {
    data object Loading : State324_44()
    data class Success(val data: String) : State324_44()
    data class Error(val message: String) : State324_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}