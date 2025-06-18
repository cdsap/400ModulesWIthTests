package com.awesomeapp.module_3_278

sealed class State278_34 {
    data object Loading : State278_34()
    data class Success(val data: String) : State278_34()
    data class Error(val message: String) : State278_34()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}