package com.awesomeapp.module_3_289

sealed class State289_16 {
    data object Loading : State289_16()
    data class Success(val data: String) : State289_16()
    data class Error(val message: String) : State289_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}