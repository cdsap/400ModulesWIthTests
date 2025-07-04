package com.awesomeapp.module_0_68

sealed class State68_38 {
    data object Loading : State68_38()
    data class Success(val data: String) : State68_38()
    data class Error(val message: String) : State68_38()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}