package com.awesomeapp.module_2_198

sealed class State198_73 {
    data object Loading : State198_73()
    data class Success(val data: String) : State198_73()
    data class Error(val message: String) : State198_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}