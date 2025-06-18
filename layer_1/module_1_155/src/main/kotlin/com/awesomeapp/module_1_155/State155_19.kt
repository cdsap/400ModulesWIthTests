package com.awesomeapp.module_1_155

sealed class State155_19 {
    data object Loading : State155_19()
    data class Success(val data: String) : State155_19()
    data class Error(val message: String) : State155_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}