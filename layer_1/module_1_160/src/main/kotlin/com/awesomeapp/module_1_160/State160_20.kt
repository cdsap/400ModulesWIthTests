package com.awesomeapp.module_1_160

sealed class State160_20 {
    data object Loading : State160_20()
    data class Success(val data: String) : State160_20()
    data class Error(val message: String) : State160_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}