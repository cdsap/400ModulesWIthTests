package com.awesomeapp.module_2_216

sealed class State216_65 {
    data object Loading : State216_65()
    data class Success(val data: String) : State216_65()
    data class Error(val message: String) : State216_65()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}