package com.awesomeapp.module_2_223

sealed class State223_94 {
    data object Loading : State223_94()
    data class Success(val data: String) : State223_94()
    data class Error(val message: String) : State223_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}