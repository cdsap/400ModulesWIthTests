package com.awesomeapp.module_4_327

sealed class State327_4 {
    data object Loading : State327_4()
    data class Success(val data: String) : State327_4()
    data class Error(val message: String) : State327_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}