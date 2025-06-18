package com.awesomeapp.module_2_197

sealed class State197_40 {
    data object Loading : State197_40()
    data class Success(val data: String) : State197_40()
    data class Error(val message: String) : State197_40()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}