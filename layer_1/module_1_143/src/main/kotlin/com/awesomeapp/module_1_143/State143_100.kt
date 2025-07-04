package com.awesomeapp.module_1_143

sealed class State143_100 {
    data object Loading : State143_100()
    data class Success(val data: String) : State143_100()
    data class Error(val message: String) : State143_100()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}