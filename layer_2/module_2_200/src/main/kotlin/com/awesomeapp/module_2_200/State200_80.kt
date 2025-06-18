package com.awesomeapp.module_2_200

sealed class State200_80 {
    data object Loading : State200_80()
    data class Success(val data: String) : State200_80()
    data class Error(val message: String) : State200_80()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}