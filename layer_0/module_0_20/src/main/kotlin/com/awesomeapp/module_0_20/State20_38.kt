package com.awesomeapp.module_0_20

sealed class State20_38 {
    data object Loading : State20_38()
    data class Success(val data: String) : State20_38()
    data class Error(val message: String) : State20_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}