package com.awesomeapp.module_3_296

sealed class State296_32 {
    data object Loading : State296_32()
    data class Success(val data: String) : State296_32()
    data class Error(val message: String) : State296_32()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}