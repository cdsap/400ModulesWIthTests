package com.awesomeapp.module_4_351

sealed class State351_52 {
    data object Loading : State351_52()
    data class Success(val data: String) : State351_52()
    data class Error(val message: String) : State351_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}