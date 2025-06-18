package com.awesomeapp.module_0_40

sealed class State40_62 {
    data object Loading : State40_62()
    data class Success(val data: String) : State40_62()
    data class Error(val message: String) : State40_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}