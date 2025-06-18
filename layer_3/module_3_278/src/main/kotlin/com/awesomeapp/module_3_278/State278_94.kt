package com.awesomeapp.module_3_278

sealed class State278_94 {
    data object Loading : State278_94()
    data class Success(val data: String) : State278_94()
    data class Error(val message: String) : State278_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}