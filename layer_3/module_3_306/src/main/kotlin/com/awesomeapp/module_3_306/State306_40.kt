package com.awesomeapp.module_3_306

sealed class State306_40 {
    data object Loading : State306_40()
    data class Success(val data: String) : State306_40()
    data class Error(val message: String) : State306_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}