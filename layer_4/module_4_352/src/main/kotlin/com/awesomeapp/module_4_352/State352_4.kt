package com.awesomeapp.module_4_352

sealed class State352_4 {
    data object Loading : State352_4()
    data class Success(val data: String) : State352_4()
    data class Error(val message: String) : State352_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}