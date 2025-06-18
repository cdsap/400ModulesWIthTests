package com.awesomeapp.module_4_349

sealed class State349_121 {
    data object Loading : State349_121()
    data class Success(val data: String) : State349_121()
    data class Error(val message: String) : State349_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}