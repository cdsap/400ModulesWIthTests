package com.awesomeapp.module_1_98

sealed class State98_67 {
    data object Loading : State98_67()
    data class Success(val data: String) : State98_67()
    data class Error(val message: String) : State98_67()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}