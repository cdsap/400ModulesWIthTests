package com.awesomeapp.module_1_116

sealed class State116_122 {
    data object Loading : State116_122()
    data class Success(val data: String) : State116_122()
    data class Error(val message: String) : State116_122()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}