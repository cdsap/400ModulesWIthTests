package com.awesomeapp.module_0_39

sealed class State39_64 {
    data object Loading : State39_64()
    data class Success(val data: String) : State39_64()
    data class Error(val message: String) : State39_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}