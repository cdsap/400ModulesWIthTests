package com.awesomeapp.module_3_274

sealed class State274_13 {
    data object Loading : State274_13()
    data class Success(val data: String) : State274_13()
    data class Error(val message: String) : State274_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}