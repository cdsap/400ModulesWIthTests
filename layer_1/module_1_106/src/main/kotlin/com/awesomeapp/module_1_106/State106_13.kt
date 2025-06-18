package com.awesomeapp.module_1_106

sealed class State106_13 {
    data object Loading : State106_13()
    data class Success(val data: String) : State106_13()
    data class Error(val message: String) : State106_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}