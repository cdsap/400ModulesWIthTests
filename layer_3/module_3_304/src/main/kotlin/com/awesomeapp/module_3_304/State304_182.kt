package com.awesomeapp.module_3_304

sealed class State304_182 {
    data object Loading : State304_182()
    data class Success(val data: String) : State304_182()
    data class Error(val message: String) : State304_182()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}