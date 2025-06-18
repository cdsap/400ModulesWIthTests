package com.awesomeapp.module_4_395

sealed class State395_97 {
    data object Loading : State395_97()
    data class Success(val data: String) : State395_97()
    data class Error(val message: String) : State395_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}