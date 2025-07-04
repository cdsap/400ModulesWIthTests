package com.awesomeapp.module_3_292

sealed class State292_44 {
    data object Loading : State292_44()
    data class Success(val data: String) : State292_44()
    data class Error(val message: String) : State292_44()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}