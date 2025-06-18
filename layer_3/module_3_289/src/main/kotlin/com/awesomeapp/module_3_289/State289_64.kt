package com.awesomeapp.module_3_289

sealed class State289_64 {
    data object Loading : State289_64()
    data class Success(val data: String) : State289_64()
    data class Error(val message: String) : State289_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}