package com.awesomeapp.module_2_216

sealed class State216_35 {
    data object Loading : State216_35()
    data class Success(val data: String) : State216_35()
    data class Error(val message: String) : State216_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}