package com.awesomeapp.module_3_243

sealed class State243_28 {
    data object Loading : State243_28()
    data class Success(val data: String) : State243_28()
    data class Error(val message: String) : State243_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}