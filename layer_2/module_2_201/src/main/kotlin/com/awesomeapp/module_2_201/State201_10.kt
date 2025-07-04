package com.awesomeapp.module_2_201

sealed class State201_10 {
    data object Loading : State201_10()
    data class Success(val data: String) : State201_10()
    data class Error(val message: String) : State201_10()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}