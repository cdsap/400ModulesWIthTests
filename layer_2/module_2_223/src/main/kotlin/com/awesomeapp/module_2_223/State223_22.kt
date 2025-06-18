package com.awesomeapp.module_2_223

sealed class State223_22 {
    data object Loading : State223_22()
    data class Success(val data: String) : State223_22()
    data class Error(val message: String) : State223_22()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}