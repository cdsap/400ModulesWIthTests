package com.awesomeapp.module_2_201

sealed class State201_19 {
    data object Loading : State201_19()
    data class Success(val data: String) : State201_19()
    data class Error(val message: String) : State201_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}