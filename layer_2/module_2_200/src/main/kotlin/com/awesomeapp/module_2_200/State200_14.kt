package com.awesomeapp.module_2_200

sealed class State200_14 {
    data object Loading : State200_14()
    data class Success(val data: String) : State200_14()
    data class Error(val message: String) : State200_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}