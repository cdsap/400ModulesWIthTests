package com.awesomeapp.module_1_93

sealed class State93_127 {
    data object Loading : State93_127()
    data class Success(val data: String) : State93_127()
    data class Error(val message: String) : State93_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}