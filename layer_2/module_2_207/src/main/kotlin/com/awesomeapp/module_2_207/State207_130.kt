package com.awesomeapp.module_2_207

sealed class State207_130 {
    data object Loading : State207_130()
    data class Success(val data: String) : State207_130()
    data class Error(val message: String) : State207_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}