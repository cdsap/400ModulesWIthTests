package com.awesomeapp.module_1_116

sealed class State116_62 {
    data object Loading : State116_62()
    data class Success(val data: String) : State116_62()
    data class Error(val message: String) : State116_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}