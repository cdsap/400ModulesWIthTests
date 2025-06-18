package com.awesomeapp.module_4_366

sealed class State366_64 {
    data object Loading : State366_64()
    data class Success(val data: String) : State366_64()
    data class Error(val message: String) : State366_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}