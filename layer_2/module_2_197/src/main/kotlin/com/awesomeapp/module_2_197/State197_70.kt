package com.awesomeapp.module_2_197

sealed class State197_70 {
    data object Loading : State197_70()
    data class Success(val data: String) : State197_70()
    data class Error(val message: String) : State197_70()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}