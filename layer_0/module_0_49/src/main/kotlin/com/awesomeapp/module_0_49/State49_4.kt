package com.awesomeapp.module_0_49

sealed class State49_4 {
    data object Loading : State49_4()
    data class Success(val data: String) : State49_4()
    data class Error(val message: String) : State49_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}