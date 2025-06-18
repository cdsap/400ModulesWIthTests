package com.awesomeapp.module_4_349

sealed class State349_64 {
    data object Loading : State349_64()
    data class Success(val data: String) : State349_64()
    data class Error(val message: String) : State349_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}