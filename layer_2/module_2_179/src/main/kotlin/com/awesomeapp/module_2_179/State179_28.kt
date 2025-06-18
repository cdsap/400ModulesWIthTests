package com.awesomeapp.module_2_179

sealed class State179_28 {
    data object Loading : State179_28()
    data class Success(val data: String) : State179_28()
    data class Error(val message: String) : State179_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}