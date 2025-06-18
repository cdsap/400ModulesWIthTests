package com.awesomeapp.module_1_143

sealed class State143_52 {
    data object Loading : State143_52()
    data class Success(val data: String) : State143_52()
    data class Error(val message: String) : State143_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}