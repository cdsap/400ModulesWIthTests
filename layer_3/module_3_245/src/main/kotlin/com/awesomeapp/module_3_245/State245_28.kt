package com.awesomeapp.module_3_245

sealed class State245_28 {
    data object Loading : State245_28()
    data class Success(val data: String) : State245_28()
    data class Error(val message: String) : State245_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}