package com.awesomeapp.module_2_236

sealed class State236_4 {
    data object Loading : State236_4()
    data class Success(val data: String) : State236_4()
    data class Error(val message: String) : State236_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}