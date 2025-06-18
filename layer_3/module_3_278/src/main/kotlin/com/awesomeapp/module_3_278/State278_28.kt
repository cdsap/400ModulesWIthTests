package com.awesomeapp.module_3_278

sealed class State278_28 {
    data object Loading : State278_28()
    data class Success(val data: String) : State278_28()
    data class Error(val message: String) : State278_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}