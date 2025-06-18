package com.awesomeapp.module_4_395

sealed class State395_190 {
    data object Loading : State395_190()
    data class Success(val data: String) : State395_190()
    data class Error(val message: String) : State395_190()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}