package com.awesomeapp.module_3_292

sealed class State292_23 {
    data object Loading : State292_23()
    data class Success(val data: String) : State292_23()
    data class Error(val message: String) : State292_23()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}