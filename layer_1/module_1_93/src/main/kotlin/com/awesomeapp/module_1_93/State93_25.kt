package com.awesomeapp.module_1_93

sealed class State93_25 {
    data object Loading : State93_25()
    data class Success(val data: String) : State93_25()
    data class Error(val message: String) : State93_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}