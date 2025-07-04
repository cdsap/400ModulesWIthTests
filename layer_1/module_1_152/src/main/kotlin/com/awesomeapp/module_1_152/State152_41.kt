package com.awesomeapp.module_1_152

sealed class State152_41 {
    data object Loading : State152_41()
    data class Success(val data: String) : State152_41()
    data class Error(val message: String) : State152_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}