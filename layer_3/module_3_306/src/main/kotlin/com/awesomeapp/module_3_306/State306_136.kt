package com.awesomeapp.module_3_306

sealed class State306_136 {
    data object Loading : State306_136()
    data class Success(val data: String) : State306_136()
    data class Error(val message: String) : State306_136()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}