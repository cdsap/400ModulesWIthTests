package com.awesomeapp.module_2_184

sealed class State184_113 {
    data object Loading : State184_113()
    data class Success(val data: String) : State184_113()
    data class Error(val message: String) : State184_113()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}