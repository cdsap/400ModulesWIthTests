package com.awesomeapp.module_0_16

sealed class State16_71 {
    data object Loading : State16_71()
    data class Success(val data: String) : State16_71()
    data class Error(val message: String) : State16_71()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}