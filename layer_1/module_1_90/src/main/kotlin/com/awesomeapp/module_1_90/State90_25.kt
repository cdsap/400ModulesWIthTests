package com.awesomeapp.module_1_90

sealed class State90_25 {
    data object Loading : State90_25()
    data class Success(val data: String) : State90_25()
    data class Error(val message: String) : State90_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}