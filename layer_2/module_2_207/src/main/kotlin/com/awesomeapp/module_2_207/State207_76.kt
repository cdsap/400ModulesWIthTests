package com.awesomeapp.module_2_207

sealed class State207_76 {
    data object Loading : State207_76()
    data class Success(val data: String) : State207_76()
    data class Error(val message: String) : State207_76()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}