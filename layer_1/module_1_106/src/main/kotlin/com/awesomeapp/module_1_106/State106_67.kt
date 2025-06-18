package com.awesomeapp.module_1_106

sealed class State106_67 {
    data object Loading : State106_67()
    data class Success(val data: String) : State106_67()
    data class Error(val message: String) : State106_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}