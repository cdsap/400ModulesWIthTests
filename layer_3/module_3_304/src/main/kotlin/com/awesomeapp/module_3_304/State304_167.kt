package com.awesomeapp.module_3_304

sealed class State304_167 {
    data object Loading : State304_167()
    data class Success(val data: String) : State304_167()
    data class Error(val message: String) : State304_167()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}