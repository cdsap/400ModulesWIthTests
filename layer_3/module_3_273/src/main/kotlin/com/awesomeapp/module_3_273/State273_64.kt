package com.awesomeapp.module_3_273

sealed class State273_64 {
    data object Loading : State273_64()
    data class Success(val data: String) : State273_64()
    data class Error(val message: String) : State273_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}