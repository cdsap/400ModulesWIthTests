package com.awesomeapp.module_4_327

sealed class State327_7 {
    data object Loading : State327_7()
    data class Success(val data: String) : State327_7()
    data class Error(val message: String) : State327_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}