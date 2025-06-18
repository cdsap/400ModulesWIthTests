package com.awesomeapp.module_2_213

sealed class State213_130 {
    data object Loading : State213_130()
    data class Success(val data: String) : State213_130()
    data class Error(val message: String) : State213_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}