package com.awesomeapp.module_2_200

sealed class State200_11 {
    data object Loading : State200_11()
    data class Success(val data: String) : State200_11()
    data class Error(val message: String) : State200_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}