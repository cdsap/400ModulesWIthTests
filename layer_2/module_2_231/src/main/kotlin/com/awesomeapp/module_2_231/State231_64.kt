package com.awesomeapp.module_2_231

sealed class State231_64 {
    data object Loading : State231_64()
    data class Success(val data: String) : State231_64()
    data class Error(val message: String) : State231_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}