package com.awesomeapp.module_1_117

sealed class State117_28 {
    data object Loading : State117_28()
    data class Success(val data: String) : State117_28()
    data class Error(val message: String) : State117_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}