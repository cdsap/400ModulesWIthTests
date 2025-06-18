package com.awesomeapp.module_1_116

sealed class State116_4 {
    data object Loading : State116_4()
    data class Success(val data: String) : State116_4()
    data class Error(val message: String) : State116_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}