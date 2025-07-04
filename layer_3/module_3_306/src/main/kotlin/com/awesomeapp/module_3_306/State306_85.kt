package com.awesomeapp.module_3_306

sealed class State306_85 {
    data object Loading : State306_85()
    data class Success(val data: String) : State306_85()
    data class Error(val message: String) : State306_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}