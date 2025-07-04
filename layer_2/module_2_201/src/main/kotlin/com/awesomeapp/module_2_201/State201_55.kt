package com.awesomeapp.module_2_201

sealed class State201_55 {
    data object Loading : State201_55()
    data class Success(val data: String) : State201_55()
    data class Error(val message: String) : State201_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}