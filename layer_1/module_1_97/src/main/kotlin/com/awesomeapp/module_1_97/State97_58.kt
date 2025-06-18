package com.awesomeapp.module_1_97

sealed class State97_58 {
    data object Loading : State97_58()
    data class Success(val data: String) : State97_58()
    data class Error(val message: String) : State97_58()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}