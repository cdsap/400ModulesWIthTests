package com.awesomeapp.module_4_351

sealed class State351_115 {
    data object Loading : State351_115()
    data class Success(val data: String) : State351_115()
    data class Error(val message: String) : State351_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}