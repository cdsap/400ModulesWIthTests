package com.awesomeapp.module_1_106

sealed class State106_61 {
    data object Loading : State106_61()
    data class Success(val data: String) : State106_61()
    data class Error(val message: String) : State106_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}