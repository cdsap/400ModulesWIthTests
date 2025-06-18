package com.awesomeapp.module_2_188

sealed class State188_143 {
    data object Loading : State188_143()
    data class Success(val data: String) : State188_143()
    data class Error(val message: String) : State188_143()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}