package com.awesomeapp.module_1_135

sealed class State135_64 {
    data object Loading : State135_64()
    data class Success(val data: String) : State135_64()
    data class Error(val message: String) : State135_64()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}