package com.awesomeapp.module_2_180

sealed class State180_11 {
    data object Loading : State180_11()
    data class Success(val data: String) : State180_11()
    data class Error(val message: String) : State180_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}