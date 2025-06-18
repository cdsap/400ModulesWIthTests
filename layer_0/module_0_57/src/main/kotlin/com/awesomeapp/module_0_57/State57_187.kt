package com.awesomeapp.module_0_57

sealed class State57_187 {
    data object Loading : State57_187()
    data class Success(val data: String) : State57_187()
    data class Error(val message: String) : State57_187()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}