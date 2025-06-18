package com.awesomeapp.module_3_274

sealed class State274_55 {
    data object Loading : State274_55()
    data class Success(val data: String) : State274_55()
    data class Error(val message: String) : State274_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}