package com.awesomeapp.module_4_351

sealed class State351_70 {
    data object Loading : State351_70()
    data class Success(val data: String) : State351_70()
    data class Error(val message: String) : State351_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}