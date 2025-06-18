package com.awesomeapp.module_2_210

sealed class State210_7 {
    data object Loading : State210_7()
    data class Success(val data: String) : State210_7()
    data class Error(val message: String) : State210_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}