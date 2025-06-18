package com.awesomeapp.module_1_112

sealed class State112_167 {
    data object Loading : State112_167()
    data class Success(val data: String) : State112_167()
    data class Error(val message: String) : State112_167()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}