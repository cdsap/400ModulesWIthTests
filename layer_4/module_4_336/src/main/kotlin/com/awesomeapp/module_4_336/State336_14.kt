package com.awesomeapp.module_4_336

sealed class State336_14 {
    data object Loading : State336_14()
    data class Success(val data: String) : State336_14()
    data class Error(val message: String) : State336_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}