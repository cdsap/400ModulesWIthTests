package com.awesomeapp.module_2_182

sealed class State182_13 {
    data object Loading : State182_13()
    data class Success(val data: String) : State182_13()
    data class Error(val message: String) : State182_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}