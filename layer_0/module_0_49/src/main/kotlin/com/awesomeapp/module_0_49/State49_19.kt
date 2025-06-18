package com.awesomeapp.module_0_49

sealed class State49_19 {
    data object Loading : State49_19()
    data class Success(val data: String) : State49_19()
    data class Error(val message: String) : State49_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}