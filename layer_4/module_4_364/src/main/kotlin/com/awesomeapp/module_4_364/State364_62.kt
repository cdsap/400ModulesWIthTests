package com.awesomeapp.module_4_364

sealed class State364_62 {
    data object Loading : State364_62()
    data class Success(val data: String) : State364_62()
    data class Error(val message: String) : State364_62()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}