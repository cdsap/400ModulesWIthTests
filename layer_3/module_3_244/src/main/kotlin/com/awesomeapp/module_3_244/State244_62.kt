package com.awesomeapp.module_3_244

sealed class State244_62 {
    data object Loading : State244_62()
    data class Success(val data: String) : State244_62()
    data class Error(val message: String) : State244_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}