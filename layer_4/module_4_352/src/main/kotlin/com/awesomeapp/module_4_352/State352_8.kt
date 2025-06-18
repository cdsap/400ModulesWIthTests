package com.awesomeapp.module_4_352

sealed class State352_8 {
    data object Loading : State352_8()
    data class Success(val data: String) : State352_8()
    data class Error(val message: String) : State352_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}