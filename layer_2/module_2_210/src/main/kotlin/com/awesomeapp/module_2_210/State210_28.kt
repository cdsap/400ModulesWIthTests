package com.awesomeapp.module_2_210

sealed class State210_28 {
    data object Loading : State210_28()
    data class Success(val data: String) : State210_28()
    data class Error(val message: String) : State210_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}