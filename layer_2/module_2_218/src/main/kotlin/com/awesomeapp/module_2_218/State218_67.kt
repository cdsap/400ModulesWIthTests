package com.awesomeapp.module_2_218

sealed class State218_67 {
    data object Loading : State218_67()
    data class Success(val data: String) : State218_67()
    data class Error(val message: String) : State218_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}