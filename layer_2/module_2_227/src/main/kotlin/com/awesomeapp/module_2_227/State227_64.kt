package com.awesomeapp.module_2_227

sealed class State227_64 {
    data object Loading : State227_64()
    data class Success(val data: String) : State227_64()
    data class Error(val message: String) : State227_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}